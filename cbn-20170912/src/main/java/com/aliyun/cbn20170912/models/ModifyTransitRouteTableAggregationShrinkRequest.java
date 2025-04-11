// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouteTableAggregationShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Use the client to generate the token, but make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run to check information such as the permissions and instance status. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): sends the request. If the request passes the check, an Enterprise Edition transit router is created.</li>
     * <li><strong>true</strong>: checks the request but does not create the Enterprise Edition transit router. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
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
     * <p>The description can be empty or 0 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("TransitRouteTableAggregationDescription")
    public String transitRouteTableAggregationDescription;

    /**
     * <p>The name of the aggregate route.</p>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TransitRouteTableAggregationName")
    public String transitRouteTableAggregationName;

    /**
     * <p>The scope of networks that you want to advertise the aggregate route.</p>
     * <p>The valid value is <strong>VPC</strong>, which indicates that the aggregate route is advertised to all VPCs that have associated forwarding correlation with the Enterprise Edition transit router and have route synchronization enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("TransitRouteTableAggregationScope")
    public String transitRouteTableAggregationScope;

    /**
     * <p>The scope of networks to which the aggregate route is advertised.</p>
     * <blockquote>
     * <p> You must select at least one attribute from either the Aggregate Route Propagation Range or the Aggregate Route Propagation Range List. We recommend using the latter. The elements of the two attributes cannot duplicate.</p>
     * </blockquote>
     */
    @NameInMap("TransitRouteTableAggregationScopeList")
    public String transitRouteTableAggregationScopeListShrink;

    /**
     * <p>The list of route table IDs of the Enterprise Edition transit router.</p>
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
