// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **false** (default): performs a dry run and sends the request.</p>
     * <p>*   **true**: performs a dry run. The system checks the required parameters and the request syntax. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the Enterprise Edition transit router is deployed.</p>
     * <br>
     * <p>You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values:</p>
     * <br>
     * <p>*   **false** (default): disables multicast</p>
     * <p>*   **true**: enables multicast</p>
     * <br>
     * <p>The multicast feature is supported only in specific regions. You can call the [ListTransitRouterAvailableResource](~~261356~~) operation to query the regions that support multicast.</p>
     */
    @NameInMap("SupportMulticast")
    public Boolean supportMulticast;

    /**
     * <p>The information about the tags.</p>
     * <br>
     * <p>You can specify at most 20 tags in each call.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterShrinkRequestTag> tag;

    /**
     * <p>The CIDR blocks of the transit router.</p>
     * <br>
     * <p>You can add up to five CIDR blocks in each call. For more information about CIDR blocks of transit routers, see [CIDR blocks of transit routers](~~462635~~).</p>
     * <br>
     * <p>> Only Enterprise Edition transit routers support CIDR blocks.</p>
     */
    @NameInMap("TransitRouterCidrList")
    public String transitRouterCidrListShrink;

    /**
     * <p>The description of the Enterprise Edition transit router.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("TransitRouterDescription")
    public String transitRouterDescription;

    /**
     * <p>The name of the Enterprise Edition transit router.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("TransitRouterName")
    public String transitRouterName;

    public static CreateTransitRouterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterShrinkRequest self = new CreateTransitRouterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterShrinkRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateTransitRouterShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouterShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouterShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTransitRouterShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouterShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouterShrinkRequest setSupportMulticast(Boolean supportMulticast) {
        this.supportMulticast = supportMulticast;
        return this;
    }
    public Boolean getSupportMulticast() {
        return this.supportMulticast;
    }

    public CreateTransitRouterShrinkRequest setTag(java.util.List<CreateTransitRouterShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTransitRouterShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateTransitRouterShrinkRequest setTransitRouterCidrListShrink(String transitRouterCidrListShrink) {
        this.transitRouterCidrListShrink = transitRouterCidrListShrink;
        return this;
    }
    public String getTransitRouterCidrListShrink() {
        return this.transitRouterCidrListShrink;
    }

    public CreateTransitRouterShrinkRequest setTransitRouterDescription(String transitRouterDescription) {
        this.transitRouterDescription = transitRouterDescription;
        return this;
    }
    public String getTransitRouterDescription() {
        return this.transitRouterDescription;
    }

    public CreateTransitRouterShrinkRequest setTransitRouterName(String transitRouterName) {
        this.transitRouterName = transitRouterName;
        return this;
    }
    public String getTransitRouterName() {
        return this.transitRouterName;
    }

    public static class CreateTransitRouterShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <br>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length, and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
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

        public static CreateTransitRouterShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterShrinkRequestTag self = new CreateTransitRouterShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTransitRouterShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
