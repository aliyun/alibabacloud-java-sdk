// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterRouteTableRequest extends TeaModel {
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
    public UpdateTransitRouterRouteTableRequestRouteTableOptions routeTableOptions;

    @NameInMap("TransitRouterRouteTableDescription")
    public String transitRouterRouteTableDescription;

    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    @NameInMap("TransitRouterRouteTableName")
    public String transitRouterRouteTableName;

    public static UpdateTransitRouterRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterRouteTableRequest self = new UpdateTransitRouterRouteTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterRouteTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTransitRouterRouteTableRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateTransitRouterRouteTableRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateTransitRouterRouteTableRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTransitRouterRouteTableRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTransitRouterRouteTableRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTransitRouterRouteTableRequest setRouteTableOptions(UpdateTransitRouterRouteTableRequestRouteTableOptions routeTableOptions) {
        this.routeTableOptions = routeTableOptions;
        return this;
    }
    public UpdateTransitRouterRouteTableRequestRouteTableOptions getRouteTableOptions() {
        return this.routeTableOptions;
    }

    public UpdateTransitRouterRouteTableRequest setTransitRouterRouteTableDescription(String transitRouterRouteTableDescription) {
        this.transitRouterRouteTableDescription = transitRouterRouteTableDescription;
        return this;
    }
    public String getTransitRouterRouteTableDescription() {
        return this.transitRouterRouteTableDescription;
    }

    public UpdateTransitRouterRouteTableRequest setTransitRouterRouteTableId(String transitRouterRouteTableId) {
        this.transitRouterRouteTableId = transitRouterRouteTableId;
        return this;
    }
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    public UpdateTransitRouterRouteTableRequest setTransitRouterRouteTableName(String transitRouterRouteTableName) {
        this.transitRouterRouteTableName = transitRouterRouteTableName;
        return this;
    }
    public String getTransitRouterRouteTableName() {
        return this.transitRouterRouteTableName;
    }

    public static class UpdateTransitRouterRouteTableRequestRouteTableOptions extends TeaModel {
        @NameInMap("MultiRegionECMP")
        public String multiRegionECMP;

        public static UpdateTransitRouterRouteTableRequestRouteTableOptions build(java.util.Map<String, ?> map) throws Exception {
            UpdateTransitRouterRouteTableRequestRouteTableOptions self = new UpdateTransitRouterRouteTableRequestRouteTableOptions();
            return TeaModel.build(map, self);
        }

        public UpdateTransitRouterRouteTableRequestRouteTableOptions setMultiRegionECMP(String multiRegionECMP) {
            this.multiRegionECMP = multiRegionECMP;
            return this;
        }
        public String getMultiRegionECMP() {
            return this.multiRegionECMP;
        }

    }

}
