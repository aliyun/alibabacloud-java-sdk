// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedBlockStorageClustersRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("DedicatedBlockStorageClusterId")
    public java.util.List<String> dedicatedBlockStorageClusterId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Status")
    public java.util.List<String> status;

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
