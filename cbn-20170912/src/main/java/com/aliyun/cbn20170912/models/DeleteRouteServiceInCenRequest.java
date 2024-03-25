// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteRouteServiceInCenRequest extends TeaModel {
    /**
     * <p>The ID of the region where the cloud service is accessed.</p>
     */
    @NameInMap("AccessRegionId")
    public String accessRegionId;

    /**
     * <p>The ID of the CEN instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The IP addresses or CIDR blocks of the cloud service.</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The region ID of the cloud service.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("HostRegionId")
    public String hostRegionId;

    /**
     * <p>The ID of the virtual private cloud (VPC) that is associated with the cloud service.</p>
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

    public static DeleteRouteServiceInCenRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteServiceInCenRequest self = new DeleteRouteServiceInCenRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteServiceInCenRequest setAccessRegionId(String accessRegionId) {
        this.accessRegionId = accessRegionId;
        return this;
    }
    public String getAccessRegionId() {
        return this.accessRegionId;
    }

    public DeleteRouteServiceInCenRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DeleteRouteServiceInCenRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DeleteRouteServiceInCenRequest setHostRegionId(String hostRegionId) {
        this.hostRegionId = hostRegionId;
        return this;
    }
    public String getHostRegionId() {
        return this.hostRegionId;
    }

    public DeleteRouteServiceInCenRequest setHostVpcId(String hostVpcId) {
        this.hostVpcId = hostVpcId;
        return this;
    }
    public String getHostVpcId() {
        return this.hostVpcId;
    }

    public DeleteRouteServiceInCenRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteRouteServiceInCenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteRouteServiceInCenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteRouteServiceInCenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
