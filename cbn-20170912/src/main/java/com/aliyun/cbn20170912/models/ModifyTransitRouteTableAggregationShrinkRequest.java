// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouteTableAggregationShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a token from your client to make sure that the token is unique among different requests. The \<code>ClientToken\\</code> parameter can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): sends a normal request and modifies the aggregate route after the request passes the check.</p>
     * </li>
     * <li><p><strong>true</strong>: sends a check request to perform a dry run. The system checks the required parameters, request format, and permissions. If the check fails, the corresponding error is returned. If the check passes, the \<code>DryRunOperation\\</code> error code is returned. In this case, the aggregate route is not modified.</p>
     * </li>
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
     * <p>The destination CIDR block of the aggregate route.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.10.0/24</p>
     */
    @NameInMap("TransitRouteTableAggregationCidr")
    public String transitRouteTableAggregationCidr;

    /**
     * <p>The description of the aggregate route.</p>
     * <p>The description can be empty or 0 to 256 characters in length. It cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("TransitRouteTableAggregationDescription")
    public String transitRouteTableAggregationDescription;

    /**
     * <p>The name of the aggregate route.</p>
     * <p>The name can be empty or 1 to 128 characters in length. It cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TransitRouteTableAggregationName")
    public String transitRouteTableAggregationName;

    /**
     * <p>The propagation scope of the aggregate route.</p>
     * <p>The only valid value is <strong>VPC</strong>. This value specifies that the aggregate route is propagated to all VPC instances that are associated with the route table of the Enterprise Edition transit router and have route synchronization enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("TransitRouteTableAggregationScope")
    public String transitRouteTableAggregationScope;

    /**
     * <p>The list of propagation scopes for the aggregate route.</p>
     * <blockquote>
     * <p>You must specify this parameter or \<code>TransitRouteTableAggregationScope\\</code>. We recommend that you specify this parameter. The elements in this list cannot be the same as the value of \<code>TransitRouteTableAggregationScope\\</code>.</p>
     * </blockquote>
     */
    @NameInMap("TransitRouteTableAggregationScopeList")
    public String transitRouteTableAggregationScopeListShrink;

    /**
     * <p>The ID of the route table of the Enterprise Edition transit router.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-6ehgc262hr170qgyc****</p>
     */
    @NameInMap("TransitRouteTableId")
    public String transitRouteTableId;

    public static ModifyTransitRouteTableAggregationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouteTableAggregationShrinkRequest self = new ModifyTransitRouteTableAggregationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouteTableAggregationShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyTransitRouteTableAggregationShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyTransitRouteTableAggregationShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyTransitRouteTableAggregationShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyTransitRouteTableAggregationShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyTransitRouteTableAggregationShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyTransitRouteTableAggregationShrinkRequest setTransitRouteTableAggregationCidr(String transitRouteTableAggregationCidr) {
        this.transitRouteTableAggregationCidr = transitRouteTableAggregationCidr;
        return this;
    }
    public String getTransitRouteTableAggregationCidr() {
        return this.transitRouteTableAggregationCidr;
    }

    public ModifyTransitRouteTableAggregationShrinkRequest setTransitRouteTableAggregationDescription(String transitRouteTableAggregationDescription) {
        this.transitRouteTableAggregationDescription = transitRouteTableAggregationDescription;
        return this;
    }
    public String getTransitRouteTableAggregationDescription() {
        return this.transitRouteTableAggregationDescription;
    }

    public ModifyTransitRouteTableAggregationShrinkRequest setTransitRouteTableAggregationName(String transitRouteTableAggregationName) {
        this.transitRouteTableAggregationName = transitRouteTableAggregationName;
        return this;
    }
    public String getTransitRouteTableAggregationName() {
        return this.transitRouteTableAggregationName;
    }

    public ModifyTransitRouteTableAggregationShrinkRequest setTransitRouteTableAggregationScope(String transitRouteTableAggregationScope) {
        this.transitRouteTableAggregationScope = transitRouteTableAggregationScope;
        return this;
    }
    public String getTransitRouteTableAggregationScope() {
        return this.transitRouteTableAggregationScope;
    }

    public ModifyTransitRouteTableAggregationShrinkRequest setTransitRouteTableAggregationScopeListShrink(String transitRouteTableAggregationScopeListShrink) {
        this.transitRouteTableAggregationScopeListShrink = transitRouteTableAggregationScopeListShrink;
        return this;
    }
    public String getTransitRouteTableAggregationScopeListShrink() {
        return this.transitRouteTableAggregationScopeListShrink;
    }

    public ModifyTransitRouteTableAggregationShrinkRequest setTransitRouteTableId(String transitRouteTableId) {
        this.transitRouteTableId = transitRouteTableId;
        return this;
    }
    public String getTransitRouteTableId() {
        return this.transitRouteTableId;
    }

}
