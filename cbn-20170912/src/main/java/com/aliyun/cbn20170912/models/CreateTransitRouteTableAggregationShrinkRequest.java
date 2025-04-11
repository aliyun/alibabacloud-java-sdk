// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouteTableAggregationShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): performs a dry run and sends the request.</li>
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters and request syntax. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
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
     * <blockquote>
     * <p> The following CIDR blocks are not supported:</p>
     * <ul>
     * <li>CIDR blocks that start with 0 or 100.64.</li>
     * <li>Multicast CIDR blocks, including 224.0.0.1 to 239.255.255.254.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.10.0/24</p>
     */
    @NameInMap("TransitRouteTableAggregationCidr")
    public String transitRouteTableAggregationCidr;

    /**
     * <p>The description of the aggregate route.</p>
     * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
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
     * <p>The scope of networks to which the aggregate route is advertised.</p>
     * <p>The valid value is <strong>VPC</strong>, which indicates that the aggregate route is advertised to all VPCs that are in associated forwarding correlation with the Enterprise Edition transit router and have route synchronization enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("TransitRouteTableAggregationScope")
    public String transitRouteTableAggregationScope;

    /**
     * <p>The list of propagation ranges of the aggregation route.</p>
     * <blockquote>
     * <p> You must specify at least one of the following attributes: Aggregation Scope and Aggregate Scope List. We recommend that you specify the latter. The elements in the two attributes cannot be duplicate.</p>
     * </blockquote>
     */
    @NameInMap("TransitRouteTableAggregationScopeList")
    public String transitRouteTableAggregationScopeListShrink;

    /**
     * <p>The ID of the route table of the Enterprise Edition transit router.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-iq8qgruq1ry8jc7vt****</p>
     */
    @NameInMap("TransitRouteTableId")
    public String transitRouteTableId;

    public static CreateTransitRouteTableAggregationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouteTableAggregationShrinkRequest self = new CreateTransitRouteTableAggregationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouteTableAggregationShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouteTableAggregationShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouteTableAggregationShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouteTableAggregationShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouteTableAggregationShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouteTableAggregationShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouteTableAggregationShrinkRequest setTransitRouteTableAggregationCidr(String transitRouteTableAggregationCidr) {
        this.transitRouteTableAggregationCidr = transitRouteTableAggregationCidr;
        return this;
    }
    public String getTransitRouteTableAggregationCidr() {
        return this.transitRouteTableAggregationCidr;
    }

    public CreateTransitRouteTableAggregationShrinkRequest setTransitRouteTableAggregationDescription(String transitRouteTableAggregationDescription) {
        this.transitRouteTableAggregationDescription = transitRouteTableAggregationDescription;
        return this;
    }
    public String getTransitRouteTableAggregationDescription() {
        return this.transitRouteTableAggregationDescription;
    }

    public CreateTransitRouteTableAggregationShrinkRequest setTransitRouteTableAggregationName(String transitRouteTableAggregationName) {
        this.transitRouteTableAggregationName = transitRouteTableAggregationName;
        return this;
    }
    public String getTransitRouteTableAggregationName() {
        return this.transitRouteTableAggregationName;
    }

    public CreateTransitRouteTableAggregationShrinkRequest setTransitRouteTableAggregationScope(String transitRouteTableAggregationScope) {
        this.transitRouteTableAggregationScope = transitRouteTableAggregationScope;
        return this;
    }
    public String getTransitRouteTableAggregationScope() {
        return this.transitRouteTableAggregationScope;
    }

    public CreateTransitRouteTableAggregationShrinkRequest setTransitRouteTableAggregationScopeListShrink(String transitRouteTableAggregationScopeListShrink) {
        this.transitRouteTableAggregationScopeListShrink = transitRouteTableAggregationScopeListShrink;
        return this;
    }
    public String getTransitRouteTableAggregationScopeListShrink() {
        return this.transitRouteTableAggregationScopeListShrink;
    }

    public CreateTransitRouteTableAggregationShrinkRequest setTransitRouteTableId(String transitRouteTableId) {
        this.transitRouteTableId = transitRouteTableId;
        return this;
    }
    public String getTransitRouteTableId() {
        return this.transitRouteTableId;
    }

}
