// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouteTableAggregationShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.</p>
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
     * <p>The description must be 0 to 256 characters in length, and can contain letters, digits, and the following special characters: , . ; / @ _ -.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("TransitRouteTableAggregationDescription")
    public String transitRouteTableAggregationDescription;

    /**
     * <p>The name of the aggregate route.</p>
     * <p>The name must be 1 to 128 characters in length, and can contain letters, digits, and the following special characters: , . ; / @ _ -. You can also leave the name empty.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TransitRouteTableAggregationName")
    public String transitRouteTableAggregationName;

    /**
     * <p>The scope of networks that you want to advertise the aggregate route.</p>
     * <p>Set the value to <strong>VPC</strong>, which specified that the aggregate route is advertised to VPCs that are in associated forwarding relationship with a route table of the Enterprise Edition transit router and have route synchronization enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("TransitRouteTableAggregationScope")
    public String transitRouteTableAggregationScope;

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
