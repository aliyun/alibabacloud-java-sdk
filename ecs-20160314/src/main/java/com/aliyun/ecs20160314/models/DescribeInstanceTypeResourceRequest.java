// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypeResourceRequest extends TeaModel {
    @NameInMap("Cores")
    public Integer cores;

    @NameInMap("InstanceTypeFamilies")
    public java.util.List<String> instanceTypeFamilies;

    @NameInMap("InstanceTypeMatchMode")
    public String instanceTypeMatchMode;

    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    @NameInMap("Memories")
    public java.util.List<Double> memories;

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

    @NameInMap("SearchTypes")
    public java.util.List<String> searchTypes;

    @NameInMap("ZoneIds")
    public java.util.List<String> zoneIds;

    public static DescribeInstanceTypeResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypeResourceRequest self = new DescribeInstanceTypeResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypeResourceRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribeInstanceTypeResourceRequest setInstanceTypeFamilies(java.util.List<String> instanceTypeFamilies) {
        this.instanceTypeFamilies = instanceTypeFamilies;
        return this;
    }
    public java.util.List<String> getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
    }

    public DescribeInstanceTypeResourceRequest setInstanceTypeMatchMode(String instanceTypeMatchMode) {
        this.instanceTypeMatchMode = instanceTypeMatchMode;
        return this;
    }
    public String getInstanceTypeMatchMode() {
        return this.instanceTypeMatchMode;
    }

    public DescribeInstanceTypeResourceRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeInstanceTypeResourceRequest setMemories(java.util.List<Double> memories) {
        this.memories = memories;
        return this;
    }
    public java.util.List<Double> getMemories() {
        return this.memories;
    }

    public DescribeInstanceTypeResourceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeInstanceTypeResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInstanceTypeResourceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceTypeResourceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceTypeResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceTypeResourceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInstanceTypeResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeInstanceTypeResourceRequest setSearchTypes(java.util.List<String> searchTypes) {
        this.searchTypes = searchTypes;
        return this;
    }
    public java.util.List<String> getSearchTypes() {
        return this.searchTypes;
    }

    public DescribeInstanceTypeResourceRequest setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

}
