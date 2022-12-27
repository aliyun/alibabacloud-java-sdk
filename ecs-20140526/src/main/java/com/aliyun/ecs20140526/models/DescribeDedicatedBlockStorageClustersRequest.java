// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedBlockStorageClustersRequest extends TeaModel {
    // The category of disks that can be created in the dedicated block storage cluster.
    // 
    // Valid value: cloud_essd. Only enhanced SSDs (ESSDs) can be created in dedicated block storage clusters.
    @NameInMap("Category")
    public String category;

    @NameInMap("DedicatedBlockStorageClusterId")
    public java.util.List<String> dedicatedBlockStorageClusterId;

    // The maximum number of entries to return on each page. Maximum value: 500.
    // 
    // Default value: 10.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The pagination token. Set the value to the NextToken value returned from a previous call to the DescribeDedicatedBlockStorageClusters operation. Leave this parameter empty when you call this operation for the first time.
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the dedicated block storage cluster. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The states of the dedicated block storage clusters. You can specify multiple cluster states to query dedicated block storage clusters in these states.
    @NameInMap("Status")
    public java.util.List<String> status;

    // The zone ID of the dedicated block storage cluster. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDedicatedBlockStorageClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedBlockStorageClustersRequest self = new DescribeDedicatedBlockStorageClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedBlockStorageClustersRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeDedicatedBlockStorageClustersRequest setDedicatedBlockStorageClusterId(java.util.List<String> dedicatedBlockStorageClusterId) {
        this.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
        return this;
    }
    public java.util.List<String> getDedicatedBlockStorageClusterId() {
        return this.dedicatedBlockStorageClusterId;
    }

    public DescribeDedicatedBlockStorageClustersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDedicatedBlockStorageClustersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDedicatedBlockStorageClustersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDedicatedBlockStorageClustersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDedicatedBlockStorageClustersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedBlockStorageClustersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDedicatedBlockStorageClustersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDedicatedBlockStorageClustersRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public DescribeDedicatedBlockStorageClustersRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
