// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRouteTableRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

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

    @NameInMap("RouteTableOptions")
    public CreateTransitRouterRouteTableRequestRouteTableOptions routeTableOptions;

    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterRouteTableRequestTag> tag;

    @NameInMap("TransitRouterId")
    public String transitRouterId;

    @NameInMap("TransitRouterRouteTableDescription")
    public String transitRouterRouteTableDescription;

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
        @NameInMap("Key")
        public String key;

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
