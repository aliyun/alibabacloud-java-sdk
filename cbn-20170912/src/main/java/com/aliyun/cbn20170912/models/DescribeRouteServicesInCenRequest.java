// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeRouteServicesInCenRequest extends TeaModel {
    /**
     * <p>The ID of the region where the cloud service is accessed.</p>
     */
    @NameInMap("AccessRegionId")
    public String accessRegionId;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The service address of the cloud service.</p>
     * <br>
     * <p>You can enter a domain name, an IP address, or a CIDR block.</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The region ID of the cloud service.</p>
     * <br>
     * <p>You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.</p>
     */
    @NameInMap("HostRegionId")
    public String hostRegionId;

    /**
     * <p>The ID of the VPC associated with the cloud service.</p>
     */
    @NameInMap("HostVpcId")
    public String hostVpcId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: **10**. Valid values: **1** to **50**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeRouteServicesInCenRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteServicesInCenRequest self = new DescribeRouteServicesInCenRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRouteServicesInCenRequest setAccessRegionId(String accessRegionId) {
        this.accessRegionId = accessRegionId;
        return this;
    }
    public String getAccessRegionId() {
        return this.accessRegionId;
    }

    public DescribeRouteServicesInCenRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeRouteServicesInCenRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeRouteServicesInCenRequest setHostRegionId(String hostRegionId) {
        this.hostRegionId = hostRegionId;
        return this;
    }
    public String getHostRegionId() {
        return this.hostRegionId;
    }

    public DescribeRouteServicesInCenRequest setHostVpcId(String hostVpcId) {
        this.hostVpcId = hostVpcId;
        return this;
    }
    public String getHostVpcId() {
        return this.hostVpcId;
    }

    public DescribeRouteServicesInCenRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeRouteServicesInCenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRouteServicesInCenRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouteServicesInCenRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouteServicesInCenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRouteServicesInCenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
