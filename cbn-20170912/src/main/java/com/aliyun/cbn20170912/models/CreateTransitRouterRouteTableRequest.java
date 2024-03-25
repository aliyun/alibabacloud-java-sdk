// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRouteTableRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to precheck the request. Check items include permissions and the status of the specified cloud resources. Valid values:</p>
     * <br>
     * <p>*   **false** (default): sends the request. If the request passes the precheck, the custom route table is created.</p>
     * <p>*   **true**: prechecks the request but does not create the custom route table. If you use this value, the system checks the required parameters and the request syntax. If the request fails to pass the precheck, an error message is returned. If the request passes the check, the system returns the ID of the request.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The features of the route table.</p>
     */
    @NameInMap("RouteTableOptions")
    public CreateTransitRouterRouteTableRequestRouteTableOptions routeTableOptions;

    /**
     * <p>The tags.</p>
     * <br>
     * <p>You can specify at most 20 tags in each call.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterRouteTableRequestTag> tag;

    /**
     * <p>The ID of the Enterprise Edition transit router.</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The description of the custom route table.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
     */
    @NameInMap("TransitRouterRouteTableDescription")
    public String transitRouterRouteTableDescription;

    /**
     * <p>The name of the custom route table.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
     */
    @NameInMap("TransitRouterRouteTableName")
    public String transitRouterRouteTableName;

    public static CreateTransitRouterRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterRouteTableRequest self = new CreateTransitRouterRouteTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterRouteTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterRouteTableRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterRouteTableRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouterRouteTableRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouterRouteTableRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouterRouteTableRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouterRouteTableRequest setRouteTableOptions(CreateTransitRouterRouteTableRequestRouteTableOptions routeTableOptions) {
        this.routeTableOptions = routeTableOptions;
        return this;
    }
    public CreateTransitRouterRouteTableRequestRouteTableOptions getRouteTableOptions() {
        return this.routeTableOptions;
    }

    public CreateTransitRouterRouteTableRequest setTag(java.util.List<CreateTransitRouterRouteTableRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTransitRouterRouteTableRequestTag> getTag() {
        return this.tag;
    }

    public CreateTransitRouterRouteTableRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public CreateTransitRouterRouteTableRequest setTransitRouterRouteTableDescription(String transitRouterRouteTableDescription) {
        this.transitRouterRouteTableDescription = transitRouterRouteTableDescription;
        return this;
    }
    public String getTransitRouterRouteTableDescription() {
        return this.transitRouterRouteTableDescription;
    }

    public CreateTransitRouterRouteTableRequest setTransitRouterRouteTableName(String transitRouterRouteTableName) {
        this.transitRouterRouteTableName = transitRouterRouteTableName;
        return this;
    }
    public String getTransitRouterRouteTableName() {
        return this.transitRouterRouteTableName;
    }

    public static class CreateTransitRouterRouteTableRequestRouteTableOptions extends TeaModel {
        /**
         * <p>Specifies whether to enable multi-region equal-cost multi-path (ECMP) routing. Valid values:</p>
         * <br>
         * <p>*   **disable**(default) If multi-region ECMP routing is disabled, routes that are learned from different regions but have the same prefix and attributes select the transit router with the smallest region ID as the next hop. Region IDs are sorted in alphabetic order. The network latency and bandwidth consumption also vary based on the region. Proceed with caution.</p>
         * <p>*   **enable** If multi-region ECMP routing is enabled, routes that are learned from different regions but have the same prefix and attributes form an ECMP route. The network latency and bandwidth consumption also vary based on the region. Proceed with caution.</p>
         */
        @NameInMap("MultiRegionECMP")
        public String multiRegionECMP;

        public static CreateTransitRouterRouteTableRequestRouteTableOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterRouteTableRequestRouteTableOptions self = new CreateTransitRouterRouteTableRequestRouteTableOptions();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterRouteTableRequestRouteTableOptions setMultiRegionECMP(String multiRegionECMP) {
            this.multiRegionECMP = multiRegionECMP;
            return this;
        }
        public String getMultiRegionECMP() {
            return this.multiRegionECMP;
        }

    }

    public static class CreateTransitRouterRouteTableRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <br>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>You can specify at most 20 tag keys.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <br>
         * <p>The tag value can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>Each tag key must have a unique tag value. You can specify at most 20 tag values in each call.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTransitRouterRouteTableRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterRouteTableRequestTag self = new CreateTransitRouterRouteTableRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterRouteTableRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTransitRouterRouteTableRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
