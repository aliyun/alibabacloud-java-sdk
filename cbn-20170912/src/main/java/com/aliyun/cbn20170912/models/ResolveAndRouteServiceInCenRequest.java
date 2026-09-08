// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ResolveAndRouteServiceInCenRequest extends TeaModel {
    /**
     * <p>The list of region IDs that access the cloud service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AccessRegionIds")
    public java.util.List<String> accessRegionIds;

    /**
     * <p>The CEN instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-ckwa2hhmuislse****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the cloud service.</p>
     * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>descname</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The IP address or CIDR block of the cloud service.</p>
     * <blockquote>
     * <p>Cloud services typically use multiple IP addresses or CIDR blocks. Call this operation repeatedly to add all IP addresses or CIDR blocks of the cloud service.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100.118.28.0/24</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The region ID of the cloud service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("HostRegionId")
    public String hostRegionId;

    /**
     * <p>The VPC-connected instance ID associated with the cloud service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-o6woh5s494zueq40v****</p>
     */
    @NameInMap("HostVpcId")
    public String hostVpcId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ResolveAndRouteServiceInCenRequest build(java.util.Map<String, ?> map) throws Exception {
        ResolveAndRouteServiceInCenRequest self = new ResolveAndRouteServiceInCenRequest();
        return TeaModel.build(map, self);
    }

    public ResolveAndRouteServiceInCenRequest setAccessRegionIds(java.util.List<String> accessRegionIds) {
        this.accessRegionIds = accessRegionIds;
        return this;
    }
    public java.util.List<String> getAccessRegionIds() {
        return this.accessRegionIds;
    }

    public ResolveAndRouteServiceInCenRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public ResolveAndRouteServiceInCenRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ResolveAndRouteServiceInCenRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ResolveAndRouteServiceInCenRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public ResolveAndRouteServiceInCenRequest setHostRegionId(String hostRegionId) {
        this.hostRegionId = hostRegionId;
        return this;
    }
    public String getHostRegionId() {
        return this.hostRegionId;
    }

    public ResolveAndRouteServiceInCenRequest setHostVpcId(String hostVpcId) {
        this.hostVpcId = hostVpcId;
        return this;
    }
    public String getHostVpcId() {
        return this.hostVpcId;
    }

    public ResolveAndRouteServiceInCenRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ResolveAndRouteServiceInCenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ResolveAndRouteServiceInCenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ResolveAndRouteServiceInCenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
