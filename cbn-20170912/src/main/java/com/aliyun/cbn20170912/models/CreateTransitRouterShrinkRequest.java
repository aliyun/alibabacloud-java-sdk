// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterShrinkRequest extends TeaModel {
    @NameInMap("CenId")
    public String cenId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SupportMulticast")
    public Boolean supportMulticast;

    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterShrinkRequestTag> tag;

    @NameInMap("TransitRouterCidrList")
    public String transitRouterCidrListShrink;

    @NameInMap("TransitRouterDescription")
    public String transitRouterDescription;

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
        @NameInMap("Key")
        public String key;

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
