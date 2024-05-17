// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RefreshTransitRouteTableAggregationRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TransitRouteTableAggregationCidr")
    public String transitRouteTableAggregationCidr;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TransitRouteTableId")
    public String transitRouteTableId;

    public static RefreshTransitRouteTableAggregationRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshTransitRouteTableAggregationRequest self = new RefreshTransitRouteTableAggregationRequest();
        return TeaModel.build(map, self);
    }

    public RefreshTransitRouteTableAggregationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RefreshTransitRouteTableAggregationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RefreshTransitRouteTableAggregationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RefreshTransitRouteTableAggregationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RefreshTransitRouteTableAggregationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RefreshTransitRouteTableAggregationRequest setTransitRouteTableAggregationCidr(String transitRouteTableAggregationCidr) {
        this.transitRouteTableAggregationCidr = transitRouteTableAggregationCidr;
        return this;
    }
    public String getTransitRouteTableAggregationCidr() {
        return this.transitRouteTableAggregationCidr;
    }

    public RefreshTransitRouteTableAggregationRequest setTransitRouteTableId(String transitRouteTableId) {
        this.transitRouteTableId = transitRouteTableId;
        return this;
    }
    public String getTransitRouteTableId() {
        return this.transitRouteTableId;
    }

}
