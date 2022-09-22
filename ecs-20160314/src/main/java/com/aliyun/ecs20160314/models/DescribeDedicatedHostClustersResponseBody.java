// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostClustersResponseBody extends TeaModel {
    @NameInMap("DedicatedHostClusters")
    public DedicatedHostClusters dedicatedHostClusters;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDedicatedHostClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostClustersResponseBody self = new DescribeDedicatedHostClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostClustersResponseBody setDedicatedHostClusters(DedicatedHostClusters dedicatedHostClusters) {
        this.dedicatedHostClusters = dedicatedHostClusters;
        return this;
    }
    public DedicatedHostClusters getDedicatedHostClusters() {
        return this.dedicatedHostClusters;
    }

    public DescribeDedicatedHostClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeDedicatedHostClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class SchedulerOptions extends TeaModel {
        @NameInMap("ManagedPrivateSpaceId")
        public String managedPrivateSpaceId;

        public static SchedulerOptions build(java.util.Map<String, ?> map) throws Exception {
            SchedulerOptions self = new SchedulerOptions();
            return TeaModel.build(map, self);
        }

        public SchedulerOptions setManagedPrivateSpaceId(String managedPrivateSpaceId) {
            this.managedPrivateSpaceId = managedPrivateSpaceId;
            return this;
        }
        public String getManagedPrivateSpaceId() {
            return this.managedPrivateSpaceId;
        }

    }

    public static class AvailableInstanceType extends TeaModel {
        @NameInMap("AvailableInstanceCapacity")
        public Integer availableInstanceCapacity;

        @NameInMap("InstanceType")
        public String instanceType;

        public static AvailableInstanceType build(java.util.Map<String, ?> map) throws Exception {
            AvailableInstanceType self = new AvailableInstanceType();
            return TeaModel.build(map, self);
        }

        public AvailableInstanceType setAvailableInstanceCapacity(Integer availableInstanceCapacity) {
            this.availableInstanceCapacity = availableInstanceCapacity;
            return this;
        }
        public Integer getAvailableInstanceCapacity() {
            return this.availableInstanceCapacity;
        }

        public AvailableInstanceType setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class AvailableInstanceTypes extends TeaModel {
        @NameInMap("AvailableInstanceType")
        public java.util.List<AvailableInstanceType> availableInstanceType;

        public static AvailableInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            AvailableInstanceTypes self = new AvailableInstanceTypes();
            return TeaModel.build(map, self);
        }

        public AvailableInstanceTypes setAvailableInstanceType(java.util.List<AvailableInstanceType> availableInstanceType) {
            this.availableInstanceType = availableInstanceType;
            return this;
        }
        public java.util.List<AvailableInstanceType> getAvailableInstanceType() {
            return this.availableInstanceType;
        }

    }

    public static class LocalStorageCapacity extends TeaModel {
        @NameInMap("AvailableDisk")
        public Integer availableDisk;

        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        @NameInMap("TotalDisk")
        public Integer totalDisk;

        public static LocalStorageCapacity build(java.util.Map<String, ?> map) throws Exception {
            LocalStorageCapacity self = new LocalStorageCapacity();
            return TeaModel.build(map, self);
        }

        public LocalStorageCapacity setAvailableDisk(Integer availableDisk) {
            this.availableDisk = availableDisk;
            return this;
        }
        public Integer getAvailableDisk() {
            return this.availableDisk;
        }

        public LocalStorageCapacity setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public LocalStorageCapacity setTotalDisk(Integer totalDisk) {
            this.totalDisk = totalDisk;
            return this;
        }
        public Integer getTotalDisk() {
            return this.totalDisk;
        }

    }

    public static class LocalStorageCapacities extends TeaModel {
        @NameInMap("LocalStorageCapacity")
        public java.util.List<LocalStorageCapacity> localStorageCapacity;

        public static LocalStorageCapacities build(java.util.Map<String, ?> map) throws Exception {
            LocalStorageCapacities self = new LocalStorageCapacities();
            return TeaModel.build(map, self);
        }

        public LocalStorageCapacities setLocalStorageCapacity(java.util.List<LocalStorageCapacity> localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }
        public java.util.List<LocalStorageCapacity> getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

    }

    public static class DedicatedHostClusterCapacity extends TeaModel {
        @NameInMap("AvailableInstanceTypes")
        public AvailableInstanceTypes availableInstanceTypes;

        @NameInMap("AvailableMemory")
        public Integer availableMemory;

        @NameInMap("AvailableVcpus")
        public Integer availableVcpus;

        @NameInMap("LocalStorageCapacities")
        public LocalStorageCapacities localStorageCapacities;

        @NameInMap("TotalMemory")
        public Integer totalMemory;

        @NameInMap("TotalVcpus")
        public Integer totalVcpus;

        public static DedicatedHostClusterCapacity build(java.util.Map<String, ?> map) throws Exception {
            DedicatedHostClusterCapacity self = new DedicatedHostClusterCapacity();
            return TeaModel.build(map, self);
        }

        public DedicatedHostClusterCapacity setAvailableInstanceTypes(AvailableInstanceTypes availableInstanceTypes) {
            this.availableInstanceTypes = availableInstanceTypes;
            return this;
        }
        public AvailableInstanceTypes getAvailableInstanceTypes() {
            return this.availableInstanceTypes;
        }

        public DedicatedHostClusterCapacity setAvailableMemory(Integer availableMemory) {
            this.availableMemory = availableMemory;
            return this;
        }
        public Integer getAvailableMemory() {
            return this.availableMemory;
        }

        public DedicatedHostClusterCapacity setAvailableVcpus(Integer availableVcpus) {
            this.availableVcpus = availableVcpus;
            return this;
        }
        public Integer getAvailableVcpus() {
            return this.availableVcpus;
        }

        public DedicatedHostClusterCapacity setLocalStorageCapacities(LocalStorageCapacities localStorageCapacities) {
            this.localStorageCapacities = localStorageCapacities;
            return this;
        }
        public LocalStorageCapacities getLocalStorageCapacities() {
            return this.localStorageCapacities;
        }

        public DedicatedHostClusterCapacity setTotalMemory(Integer totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Integer getTotalMemory() {
            return this.totalMemory;
        }

        public DedicatedHostClusterCapacity setTotalVcpus(Integer totalVcpus) {
            this.totalVcpus = totalVcpus;
            return this;
        }
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

    }

    public static class DedicatedHostIds extends TeaModel {
        @NameInMap("DedicatedHostId")
        public java.util.List<String> dedicatedHostId;

        public static DedicatedHostIds build(java.util.Map<String, ?> map) throws Exception {
            DedicatedHostIds self = new DedicatedHostIds();
            return TeaModel.build(map, self);
        }

        public DedicatedHostIds setDedicatedHostId(java.util.List<String> dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public java.util.List<String> getDedicatedHostId() {
            return this.dedicatedHostId;
        }

    }

    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public Tag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<Tag> tag;

        public static Tags build(java.util.Map<String, ?> map) throws Exception {
            Tags self = new Tags();
            return TeaModel.build(map, self);
        }

        public Tags setTag(java.util.List<Tag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

    }

    public static class DedicatedHostCluster extends TeaModel {
        @NameInMap("SchedulerOptions")
        @Validation(required = true)
        public SchedulerOptions schedulerOptions;

        @NameInMap("DedicatedHostClusterCapacity")
        public DedicatedHostClusterCapacity dedicatedHostClusterCapacity;

        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        @NameInMap("DedicatedHostClusterName")
        public String dedicatedHostClusterName;

        @NameInMap("DedicatedHostIds")
        public DedicatedHostIds dedicatedHostIds;

        @NameInMap("Description")
        public String description;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public Tags tags;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DedicatedHostCluster build(java.util.Map<String, ?> map) throws Exception {
            DedicatedHostCluster self = new DedicatedHostCluster();
            return TeaModel.build(map, self);
        }

        public DedicatedHostCluster setSchedulerOptions(SchedulerOptions schedulerOptions) {
            this.schedulerOptions = schedulerOptions;
            return this;
        }
        public SchedulerOptions getSchedulerOptions() {
            return this.schedulerOptions;
        }

        public DedicatedHostCluster setDedicatedHostClusterCapacity(DedicatedHostClusterCapacity dedicatedHostClusterCapacity) {
            this.dedicatedHostClusterCapacity = dedicatedHostClusterCapacity;
            return this;
        }
        public DedicatedHostClusterCapacity getDedicatedHostClusterCapacity() {
            return this.dedicatedHostClusterCapacity;
        }

        public DedicatedHostCluster setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public DedicatedHostCluster setDedicatedHostClusterName(String dedicatedHostClusterName) {
            this.dedicatedHostClusterName = dedicatedHostClusterName;
            return this;
        }
        public String getDedicatedHostClusterName() {
            return this.dedicatedHostClusterName;
        }

        public DedicatedHostCluster setDedicatedHostIds(DedicatedHostIds dedicatedHostIds) {
            this.dedicatedHostIds = dedicatedHostIds;
            return this;
        }
        public DedicatedHostIds getDedicatedHostIds() {
            return this.dedicatedHostIds;
        }

        public DedicatedHostCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DedicatedHostCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DedicatedHostCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DedicatedHostCluster setTags(Tags tags) {
            this.tags = tags;
            return this;
        }
        public Tags getTags() {
            return this.tags;
        }

        public DedicatedHostCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DedicatedHostClusters extends TeaModel {
        @NameInMap("DedicatedHostCluster")
        public java.util.List<DedicatedHostCluster> dedicatedHostCluster;

        public static DedicatedHostClusters build(java.util.Map<String, ?> map) throws Exception {
            DedicatedHostClusters self = new DedicatedHostClusters();
            return TeaModel.build(map, self);
        }

        public DedicatedHostClusters setDedicatedHostCluster(java.util.List<DedicatedHostCluster> dedicatedHostCluster) {
            this.dedicatedHostCluster = dedicatedHostCluster;
            return this;
        }
        public java.util.List<DedicatedHostCluster> getDedicatedHostCluster() {
            return this.dedicatedHostCluster;
        }

    }

}
