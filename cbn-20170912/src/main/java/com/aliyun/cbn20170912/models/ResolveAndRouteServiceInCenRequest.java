// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ResolveAndRouteServiceInCenRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("Host")
    public String host;

    @NameInMap("HostRegionId")
    public String hostRegionId;

    @NameInMap("UpdateInterval")
    public Long updateInterval;

    @NameInMap("HostVpcId")
    public String hostVpcId;

    @NameInMap("Description")
    public String description;

    @NameInMap("AccessRegionIds")
    public java.util.List<String> accessRegionIds;

    public static ResolveAndRouteServiceInCenRequest build(java.util.Map<String, ?> map) throws Exception {
        ResolveAndRouteServiceInCenRequest self = new ResolveAndRouteServiceInCenRequest();
        return TeaModel.build(map, self);
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

    public ResolveAndRouteServiceInCenRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ResolveAndRouteServiceInCenRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
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

    public ResolveAndRouteServiceInCenRequest setUpdateInterval(Long updateInterval) {
        this.updateInterval = updateInterval;
        return this;
    }
    public Long getUpdateInterval() {
        return this.updateInterval;
    }

    public ResolveAndRouteServiceInCenRequest setHostVpcId(String hostVpcId) {
        this.hostVpcId = hostVpcId;
        return this;
    }
    public String getHostVpcId() {
        return this.hostVpcId;
    }

    public ResolveAndRouteServiceInCenRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ResolveAndRouteServiceInCenRequest setAccessRegionIds(java.util.List<String> accessRegionIds) {
        this.accessRegionIds = accessRegionIds;
        return this;
    }
    public java.util.List<String> getAccessRegionIds() {
        return this.accessRegionIds;
    }

}
