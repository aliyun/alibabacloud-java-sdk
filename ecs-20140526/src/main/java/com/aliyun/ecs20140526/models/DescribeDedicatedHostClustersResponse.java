// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostClustersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("DedicatedHostClusters")
    @Validation(required = true)
    public DescribeDedicatedHostClustersResponseDedicatedHostClusters dedicatedHostClusters;

    public static DescribeDedicatedHostClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostClustersResponse self = new DescribeDedicatedHostClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostClustersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostClustersResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDedicatedHostClustersResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDedicatedHostClustersResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDedicatedHostClustersResponse setDedicatedHostClusters(DescribeDedicatedHostClustersResponseDedicatedHostClusters dedicatedHostClusters) {
        this.dedicatedHostClusters = dedicatedHostClusters;
        return this;
    }
    public DescribeDedicatedHostClustersResponseDedicatedHostClusters getDedicatedHostClusters() {
        return this.dedicatedHostClusters;
    }

    public static class DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTagsTag self = new DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTagsTag> tag;

        public static DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTags self = new DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTags setTag(java.util.List<DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity extends TeaModel {
        @NameInMap("TotalDisk")
        @Validation(required = true)
        public Integer totalDisk;

        @NameInMap("AvailableDisk")
        @Validation(required = true)
        public Integer availableDisk;

        @NameInMap("DataDiskCategory")
        @Validation(required = true)
        public String dataDiskCategory;

        public static DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity self = new DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity setTotalDisk(Integer totalDisk) {
            this.totalDisk = totalDisk;
            return this;
        }
        public Integer getTotalDisk() {
            return this.totalDisk;
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity setAvailableDisk(Integer availableDisk) {
            this.availableDisk = availableDisk;
            return this;
        }
        public Integer getAvailableDisk() {
            return this.availableDisk;
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

    }

    public static class DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities extends TeaModel {
        @NameInMap("LocalStorageCapacity")
        @Validation(required = true)
        public java.util.List<DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity> localStorageCapacity;

        public static DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities self = new DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities setLocalStorageCapacity(java.util.List<DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity> localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }
        public java.util.List<DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity> getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

    }

    public static class DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity extends TeaModel {
        @NameInMap("TotalVcpus")
        @Validation(required = true)
        public Integer totalVcpus;

        @NameInMap("AvailableVcpus")
        @Validation(required = true)
        public Integer availableVcpus;

        @NameInMap("TotalMemory")
        @Validation(required = true)
        public Integer totalMemory;

        @NameInMap("AvailableMemory")
        @Validation(required = true)
        public Integer availableMemory;

        @NameInMap("LocalStorageCapacities")
        @Validation(required = true)
        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities localStorageCapacities;

        public static DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity self = new DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity setTotalVcpus(Integer totalVcpus) {
            this.totalVcpus = totalVcpus;
            return this;
        }
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity setAvailableVcpus(Integer availableVcpus) {
            this.availableVcpus = availableVcpus;
            return this;
        }
        public Integer getAvailableVcpus() {
            return this.availableVcpus;
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity setTotalMemory(Integer totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Integer getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity setAvailableMemory(Integer availableMemory) {
            this.availableMemory = availableMemory;
            return this;
        }
        public Integer getAvailableMemory() {
            return this.availableMemory;
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity setLocalStorageCapacities(DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities localStorageCapacities) {
            this.localStorageCapacities = localStorageCapacities;
            return this;
        }
        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities getLocalStorageCapacities() {
            return this.localStorageCapacities;
        }

    }

    public static class DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostIds extends TeaModel {
        // DedicatedHostId
        @NameInMap("DedicatedHostId")
        @Validation(required = true)
        public java.util.List<String> dedicatedHostId;

        public static DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostIds self = new DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostIds();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostIds setDedicatedHostId(java.util.List<String> dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public java.util.List<String> getDedicatedHostId() {
            return this.dedicatedHostId;
        }

    }

    public static class DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster extends TeaModel {
        @NameInMap("DedicatedHostClusterId")
        @Validation(required = true)
        public String dedicatedHostClusterId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("DedicatedHostClusterName")
        @Validation(required = true)
        public String dedicatedHostClusterName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTags tags;

        @NameInMap("DedicatedHostClusterCapacity")
        @Validation(required = true)
        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity dedicatedHostClusterCapacity;

        @NameInMap("DedicatedHostIds")
        @Validation(required = true)
        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostIds dedicatedHostIds;

        public static DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster self = new DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster setDedicatedHostClusterName(String dedicatedHostClusterName) {
            this.dedicatedHostClusterName = dedicatedHostClusterName;
            return this;
        }
        public String getDedicatedHostClusterName() {
            return this.dedicatedHostClusterName;
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster setTags(DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterTags getTags() {
            return this.tags;
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster setDedicatedHostClusterCapacity(DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity dedicatedHostClusterCapacity) {
            this.dedicatedHostClusterCapacity = dedicatedHostClusterCapacity;
            return this;
        }
        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity getDedicatedHostClusterCapacity() {
            return this.dedicatedHostClusterCapacity;
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster setDedicatedHostIds(DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostIds dedicatedHostIds) {
            this.dedicatedHostIds = dedicatedHostIds;
            return this;
        }
        public DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostClusterDedicatedHostIds getDedicatedHostIds() {
            return this.dedicatedHostIds;
        }

    }

    public static class DescribeDedicatedHostClustersResponseDedicatedHostClusters extends TeaModel {
        @NameInMap("DedicatedHostCluster")
        @Validation(required = true)
        public java.util.List<DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster> dedicatedHostCluster;

        public static DescribeDedicatedHostClustersResponseDedicatedHostClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseDedicatedHostClusters self = new DescribeDedicatedHostClustersResponseDedicatedHostClusters();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseDedicatedHostClusters setDedicatedHostCluster(java.util.List<DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster> dedicatedHostCluster) {
            this.dedicatedHostCluster = dedicatedHostCluster;
            return this;
        }
        public java.util.List<DescribeDedicatedHostClustersResponseDedicatedHostClustersDedicatedHostCluster> getDedicatedHostCluster() {
            return this.dedicatedHostCluster;
        }

    }

}
