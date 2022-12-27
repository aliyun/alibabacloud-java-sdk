// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeClassicLinkInstancesRequest extends TeaModel {
    // The ID of the instance. You can specify a maximum of 100 instance IDs in a single request. Separate multiple IDs with commas (,).
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. Pages start from page 1.
    // 
    // Default value: 1
    @NameInMap("PageNumber")
    public String pageNumber;

    // The number of entries to return on each page. Valid values: 1 to 100.
    // 
    // Default value: 10
    @NameInMap("PageSize")
    public String pageSize;

    // The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The ID of the VPC. The ClassicLink feature must be enabled for the specified VPC. For more information, see [Establish a ClassicLink connection](~~65413~~).
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeClassicLinkInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClassicLinkInstancesRequest self = new DescribeClassicLinkInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClassicLinkInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeClassicLinkInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeClassicLinkInstancesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClassicLinkInstancesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeClassicLinkInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeClassicLinkInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeClassicLinkInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeClassicLinkInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
