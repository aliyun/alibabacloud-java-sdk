// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRouteTableRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run, including permission and instance status verification. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): sends a normal request and creates the custom route table after the request passes the verification.</li>
     * <li><strong>true</strong>: sends a check request without creating the custom route table. The system checks the required parameters, request format, and other conditions. If the check fails, the corresponding error is returned. If the check passes, the corresponding request ID is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
     * <p>The route table options.</p>
     */
    @NameInMap("RouteTableOptions")
    public CreateTransitRouterRouteTableRequestRouteTableOptions routeTableOptions;

    /**
     * <p>The tag information.</p>
     * <p>You can specify up to 20 tags at a time.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterRouteTableRequestTag> tag;

    /**
     * <p>The ID of the Enterprise Edition transit router instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-bp1su1ytdxtataupl****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The description of the custom route table.</p>
     * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>testdesc</p>
     */
    @NameInMap("TransitRouterRouteTableDescription")
    public String transitRouterRouteTableDescription;

    /**
     * <p>The name of the custom route table.</p>
     * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
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
         * <p>The multi-region equal-cost multi-path (ECMP) routing setting. Valid values:</p>
         * <ul>
         * <li><strong>disable</strong> (default): disables multi-region ECMP routing. After multi-region ECMP routing is disabled, routes with the same prefix learned from different regions prefer the transit router whose Region ID is the smallest (sorted alphabetically) as the next hop when other route attributes are the same. This may change traffic latency and bandwidth consumption between regions. Make sure that you fully evaluate the impact before disabling this feature.</li>
         * <li><strong>enable</strong>: enables multi-region ECMP routing. After multi-region ECMP routing is enabled, routes with the same prefix learned from different regions form ECMP routes when other route attributes are the same. This may change traffic latency and bandwidth consumption between regions. Make sure that you fully evaluate the impact before enabling this feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
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
         * <p>The tag key of the resource.</p>
         * <p>Once specified, the tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>Once specified, the tag value cannot be empty. The tag value can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * <p>Each tag key corresponds to one tag value. You can specify up to 20 tag values at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
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
