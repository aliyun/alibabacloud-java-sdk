// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouteTableAggregationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>02fb3da4****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.10.0/24</p>
     */
    @NameInMap("TransitRouteTableAggregationCidr")
    public String transitRouteTableAggregationCidr;

    /**
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("TransitRouteTableAggregationDescription")
    public String transitRouteTableAggregationDescription;

    /**
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TransitRouteTableAggregationName")
    public String transitRouteTableAggregationName;

    /**
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("TransitRouteTableAggregationScope")
    public String transitRouteTableAggregationScope;

    @NameInMap("TransitRouteTableAggregationScopeList")
    public java.util.List<String> transitRouteTableAggregationScopeList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-6ehgc262hr170qgyc****</p>
     */
    @NameInMap("TransitRouteTableId")
    public String transitRouteTableId;

    public static ModifyTransitRouteTableAggregationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouteTableAggregationRequest self = new ModifyTransitRouteTableAggregationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouteTableAggregationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyTransitRouteTableAggregationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyTransitRouteTableAggregationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyTransitRouteTableAggregationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyTransitRouteTableAggregationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyTransitRouteTableAggregationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyTransitRouteTableAggregationRequest setTransitRouteTableAggregationCidr(String transitRouteTableAggregationCidr) {
        this.transitRouteTableAggregationCidr = transitRouteTableAggregationCidr;
        return this;
    }
    public String getTransitRouteTableAggregationCidr() {
        return this.transitRouteTableAggregationCidr;
    }

    public ModifyTransitRouteTableAggregationRequest setTransitRouteTableAggregationDescription(String transitRouteTableAggregationDescription) {
        this.transitRouteTableAggregationDescription = transitRouteTableAggregationDescription;
        return this;
    }
    public String getTransitRouteTableAggregationDescription() {
        return this.transitRouteTableAggregationDescription;
    }

    public ModifyTransitRouteTableAggregationRequest setTransitRouteTableAggregationName(String transitRouteTableAggregationName) {
        this.transitRouteTableAggregationName = transitRouteTableAggregationName;
        return this;
    }
    public String getTransitRouteTableAggregationName() {
        return this.transitRouteTableAggregationName;
    }

    public ModifyTransitRouteTableAggregationRequest setTransitRouteTableAggregationScope(String transitRouteTableAggregationScope) {
        this.transitRouteTableAggregationScope = transitRouteTableAggregationScope;
        return this;
    }
    public String getTransitRouteTableAggregationScope() {
        return this.transitRouteTableAggregationScope;
    }

    public ModifyTransitRouteTableAggregationRequest setTransitRouteTableAggregationScopeList(java.util.List<String> transitRouteTableAggregationScopeList) {
        this.transitRouteTableAggregationScopeList = transitRouteTableAggregationScopeList;
        return this;
    }
    public java.util.List<String> getTransitRouteTableAggregationScopeList() {
        return this.transitRouteTableAggregationScopeList;
    }

    public ModifyTransitRouteTableAggregationRequest setTransitRouteTableId(String transitRouteTableId) {
        this.transitRouteTableId = transitRouteTableId;
        return this;
    }
    public String getTransitRouteTableId() {
        return this.transitRouteTableId;
    }

}
