// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterInstanceListRequest extends TeaModel {
    // The ID of the dedicated cluster to which the instance belongs.
    // 
    // >  Separate multiple IDs with commas (,).
    @NameInMap("ClusterId")
    public String clusterId;

    // The name of the dedicated host.
    // 
    // >  Separate multiple names with commas (,).
    @NameInMap("DedicatedHostName")
    public String dedicatedHostName;

    // The database engine. Set the value to MongoDB.
    @NameInMap("Engine")
    public String engine;

    // The version number of the database engine. Set the value to **4.2**.
    @NameInMap("EngineVersion")
    public String engineVersion;

    // The ID of the ApsaraDB for MongoDB instance.
    // 
    // >  Separate multiple IDs with commas (,).
    @NameInMap("InstanceId")
    public String instanceId;

    // The network type of the instance. Valid values:
    // 
    // *   0: The instance is connected over the Internet.
    // *   1: The instance is connected over an internal network.
    // *   2\. The instance is deployed in a VPC.
    // 
    // Default value: 1.
    @NameInMap("InstanceNetType")
    public String instanceNetType;

    // The status of the instance. For information about the valid values of this parameter, see [Valid values of the InstanceStatus parameter for DescribeDedicatedClusterInstanceList](~~190071~~).
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. Valid values: any non-zero positive integer. Default value: **1**.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Valid values: **30**, **50**, and **100**. Default value: **30**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the region. You can call the [DescribeRegions](~~61933~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The ID of the zone. You can call [DescribeZones](~~61933~~) to query the zone ID.
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDedicatedClusterInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedClusterInstanceListRequest self = new DescribeDedicatedClusterInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedClusterInstanceListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeDedicatedClusterInstanceListRequest setDedicatedHostName(String dedicatedHostName) {
        this.dedicatedHostName = dedicatedHostName;
        return this;
    }
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    public DescribeDedicatedClusterInstanceListRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDedicatedClusterInstanceListRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeDedicatedClusterInstanceListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDedicatedClusterInstanceListRequest setInstanceNetType(String instanceNetType) {
        this.instanceNetType = instanceNetType;
        return this;
    }
    public String getInstanceNetType() {
        return this.instanceNetType;
    }

    public DescribeDedicatedClusterInstanceListRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeDedicatedClusterInstanceListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDedicatedClusterInstanceListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDedicatedClusterInstanceListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDedicatedClusterInstanceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDedicatedClusterInstanceListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedClusterInstanceListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDedicatedClusterInstanceListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDedicatedClusterInstanceListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDedicatedClusterInstanceListRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
