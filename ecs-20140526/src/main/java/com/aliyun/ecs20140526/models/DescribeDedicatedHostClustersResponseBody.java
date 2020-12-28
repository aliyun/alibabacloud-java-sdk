// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostClustersResponseBody extends TeaModel {
    @NameInMap("DedicatedHostClusters")
    public java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters> dedicatedHostClusters;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeDedicatedHostClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostClustersResponseBody self = new DescribeDedicatedHostClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostClustersResponseBody setDedicatedHostClusters(java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters> dedicatedHostClusters) {
        this.dedicatedHostClusters = dedicatedHostClusters;
        return this;
    }
    public java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters> getDedicatedHostClusters() {
        return this.dedicatedHostClusters;
    }

    public DescribeDedicatedHostClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDedicatedHostClustersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDedicatedHostClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersTags extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersTags self = new DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersTags();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacityLocalStorageCapacities extends TeaModel {
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        @NameInMap("AvailableDisk")
        public Integer availableDisk;

        @NameInMap("TotalDisk")
        public Integer totalDisk;

        public static DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacityLocalStorageCapacities build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacityLocalStorageCapacities self = new DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacityLocalStorageCapacities();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacityLocalStorageCapacities setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacityLocalStorageCapacities setAvailableDisk(Integer availableDisk) {
            this.availableDisk = availableDisk;
            return this;
        }
        public Integer getAvailableDisk() {
            return this.availableDisk;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacityLocalStorageCapacities setTotalDisk(Integer totalDisk) {
            this.totalDisk = totalDisk;
            return this;
        }
        public Integer getTotalDisk() {
            return this.totalDisk;
        }

    }

    public static class DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacity extends TeaModel {
        @NameInMap("LocalStorageCapacities")
        public java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacityLocalStorageCapacities> localStorageCapacities;

        @NameInMap("AvailableMemory")
        public Integer availableMemory;

        @NameInMap("TotalMemory")
        public Integer totalMemory;

        @NameInMap("TotalVcpus")
        public Integer totalVcpus;

        @NameInMap("AvailableVcpus")
        public Integer availableVcpus;

        public static DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacity self = new DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacity setLocalStorageCapacities(java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacityLocalStorageCapacities> localStorageCapacities) {
            this.localStorageCapacities = localStorageCapacities;
            return this;
        }
        public java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacityLocalStorageCapacities> getLocalStorageCapacities() {
            return this.localStorageCapacities;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacity setAvailableMemory(Integer availableMemory) {
            this.availableMemory = availableMemory;
            return this;
        }
        public Integer getAvailableMemory() {
            return this.availableMemory;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacity setTotalMemory(Integer totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Integer getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacity setTotalVcpus(Integer totalVcpus) {
            this.totalVcpus = totalVcpus;
            return this;
        }
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacity setAvailableVcpus(Integer availableVcpus) {
            this.availableVcpus = availableVcpus;
            return this;
        }
        public Integer getAvailableVcpus() {
            return this.availableVcpus;
        }

    }

    public static class DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Tags")
        public java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersTags> tags;

        @NameInMap("DedicatedHostClusterCapacity")
        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacity dedicatedHostClusterCapacity;

        @NameInMap("DedicatedHostIds")
        public java.util.List<String> dedicatedHostIds;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("DedicatedHostClusterName")
        public String dedicatedHostClusterName;

        public static DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters self = new DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters setTags(java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersTags> getTags() {
            return this.tags;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters setDedicatedHostClusterCapacity(DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacity dedicatedHostClusterCapacity) {
            this.dedicatedHostClusterCapacity = dedicatedHostClusterCapacity;
            return this;
        }
        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterCapacity getDedicatedHostClusterCapacity() {
            return this.dedicatedHostClusterCapacity;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters setDedicatedHostIds(java.util.List<String> dedicatedHostIds) {
            this.dedicatedHostIds = dedicatedHostIds;
            return this;
        }
        public java.util.List<String> getDedicatedHostIds() {
            return this.dedicatedHostIds;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters setDedicatedHostClusterName(String dedicatedHostClusterName) {
            this.dedicatedHostClusterName = dedicatedHostClusterName;
            return this;
        }
        public String getDedicatedHostClusterName() {
            return this.dedicatedHostClusterName;
        }

    }

}
