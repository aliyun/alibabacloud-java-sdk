// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterInstanceListRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DedicatedHostName")
    public String dedicatedHostName;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceNetType")
    public String instanceNetType;

    @NameInMap("InstanceStatus")
    public String instanceStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

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
