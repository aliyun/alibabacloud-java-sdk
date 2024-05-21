// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostClustersResponseBody extends TeaModel {
    /**
     * <p>Details about the dedicated host clusters.</p>
     */
    @NameInMap("DedicatedHostClusters")
    public DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters dedicatedHostClusters;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of dedicated host clusters.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDedicatedHostClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostClustersResponseBody self = new DescribeDedicatedHostClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostClustersResponseBody setDedicatedHostClusters(DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters dedicatedHostClusters) {
        this.dedicatedHostClusters = dedicatedHostClusters;
        return this;
    }
    public DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters getDedicatedHostClusters() {
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

    public static class DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypesAvailableInstanceType extends TeaModel {
        /**
         * <p>The available capacity of the ECS instance type.</p>
         */
        @NameInMap("AvailableInstanceCapacity")
        public Integer availableInstanceCapacity;

        /**
         * <p>The ECS instance type.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypesAvailableInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypesAvailableInstanceType self = new DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypesAvailableInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypesAvailableInstanceType setAvailableInstanceCapacity(Integer availableInstanceCapacity) {
            this.availableInstanceCapacity = availableInstanceCapacity;
            return this;
        }
        public Integer getAvailableInstanceCapacity() {
            return this.availableInstanceCapacity;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypesAvailableInstanceType setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypes extends TeaModel {
        @NameInMap("AvailableInstanceType")
        public java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypesAvailableInstanceType> availableInstanceType;

        public static DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypes self = new DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypes setAvailableInstanceType(java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypesAvailableInstanceType> availableInstanceType) {
            this.availableInstanceType = availableInstanceType;
            return this;
        }
        public java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypesAvailableInstanceType> getAvailableInstanceType() {
            return this.availableInstanceType;
        }

    }

    public static class DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity extends TeaModel {
        /**
         * <p>The available capacity of the local disk. Unit: GiB</p>
         */
        @NameInMap("AvailableDisk")
        public Integer availableDisk;

        /**
         * <p>The category of data disks. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk</p>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: standard SSD</p>
         * <p>*   ephemeral_ssd: local SSD</p>
         * <p>*   cloud_essd: Enterprise SSD (ESSD)</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <p>The total capacity of the local disk. Unit: GiB</p>
         */
        @NameInMap("TotalDisk")
        public Integer totalDisk;

        public static DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity self = new DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity setAvailableDisk(Integer availableDisk) {
            this.availableDisk = availableDisk;
            return this;
        }
        public Integer getAvailableDisk() {
            return this.availableDisk;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity setTotalDisk(Integer totalDisk) {
            this.totalDisk = totalDisk;
            return this;
        }
        public Integer getTotalDisk() {
            return this.totalDisk;
        }

    }

    public static class DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities extends TeaModel {
        @NameInMap("LocalStorageCapacity")
        public java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity> localStorageCapacity;

        public static DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities self = new DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities setLocalStorageCapacity(java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity> localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }
        public java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacitiesLocalStorageCapacity> getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

    }

    public static class DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity extends TeaModel {
        /**
         * <p>The available capacity of the Elastic Compute Service (ECS) instance types in the dedicated host cluster.</p>
         */
        @NameInMap("AvailableInstanceTypes")
        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypes availableInstanceTypes;

        /**
         * <p>The size of available memory. Unit: GiB</p>
         */
        @NameInMap("AvailableMemory")
        public Integer availableMemory;

        /**
         * <p>The number of available vCPUs.</p>
         */
        @NameInMap("AvailableVcpus")
        public Integer availableVcpus;

        /**
         * <p>The local storage capacity.</p>
         */
        @NameInMap("LocalStorageCapacities")
        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities localStorageCapacities;

        /**
         * <p>The total memory size. Unit: GiB</p>
         */
        @NameInMap("TotalMemory")
        public Integer totalMemory;

        /**
         * <p>The total number of vCPUs.</p>
         */
        @NameInMap("TotalVcpus")
        public Integer totalVcpus;

        public static DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity self = new DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity setAvailableInstanceTypes(DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypes availableInstanceTypes) {
            this.availableInstanceTypes = availableInstanceTypes;
            return this;
        }
        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityAvailableInstanceTypes getAvailableInstanceTypes() {
            return this.availableInstanceTypes;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity setAvailableMemory(Integer availableMemory) {
            this.availableMemory = availableMemory;
            return this;
        }
        public Integer getAvailableMemory() {
            return this.availableMemory;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity setAvailableVcpus(Integer availableVcpus) {
            this.availableVcpus = availableVcpus;
            return this;
        }
        public Integer getAvailableVcpus() {
            return this.availableVcpus;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity setLocalStorageCapacities(DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities localStorageCapacities) {
            this.localStorageCapacities = localStorageCapacities;
            return this;
        }
        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacityLocalStorageCapacities getLocalStorageCapacities() {
            return this.localStorageCapacities;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity setTotalMemory(Integer totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Integer getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity setTotalVcpus(Integer totalVcpus) {
            this.totalVcpus = totalVcpus;
            return this;
        }
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

    }

    public static class DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostIds extends TeaModel {
        @NameInMap("DedicatedHostId")
        public java.util.List<String> dedicatedHostId;

        public static DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostIds self = new DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostIds();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostIds setDedicatedHostId(java.util.List<String> dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public java.util.List<String> getDedicatedHostId() {
            return this.dedicatedHostId;
        }

    }

    public static class DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTagsTag extends TeaModel {
        /**
         * <p>The tag key of the dedicated host cluster.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the dedicated host cluster.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTagsTag self = new DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTagsTag> tag;

        public static DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTags self = new DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTags setTag(java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster extends TeaModel {
        /**
         * <p>The capacity of the dedicated host cluster.</p>
         */
        @NameInMap("DedicatedHostClusterCapacity")
        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity dedicatedHostClusterCapacity;

        /**
         * <p>The ID of the dedicated host cluster.</p>
         */
        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        /**
         * <p>The name of the dedicated host cluster.</p>
         */
        @NameInMap("DedicatedHostClusterName")
        public String dedicatedHostClusterName;

        /**
         * <p>The IDs of dedicated hosts in the dedicated host cluster.</p>
         */
        @NameInMap("DedicatedHostIds")
        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostIds dedicatedHostIds;

        /**
         * <p>The description of the dedicated host cluster.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The region ID of the dedicated host cluster.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the dedicated host cluster belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags of the dedicated host cluster.</p>
         */
        @NameInMap("Tags")
        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTags tags;

        /**
         * <p>The zone ID of the dedicated host cluster.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster self = new DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster setDedicatedHostClusterCapacity(DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity dedicatedHostClusterCapacity) {
            this.dedicatedHostClusterCapacity = dedicatedHostClusterCapacity;
            return this;
        }
        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostClusterCapacity getDedicatedHostClusterCapacity() {
            return this.dedicatedHostClusterCapacity;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster setDedicatedHostClusterName(String dedicatedHostClusterName) {
            this.dedicatedHostClusterName = dedicatedHostClusterName;
            return this;
        }
        public String getDedicatedHostClusterName() {
            return this.dedicatedHostClusterName;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster setDedicatedHostIds(DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostIds dedicatedHostIds) {
            this.dedicatedHostIds = dedicatedHostIds;
            return this;
        }
        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterDedicatedHostIds getDedicatedHostIds() {
            return this.dedicatedHostIds;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster setTags(DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostClusterTags getTags() {
            return this.tags;
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters extends TeaModel {
        @NameInMap("DedicatedHostCluster")
        public java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster> dedicatedHostCluster;

        public static DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters self = new DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersResponseBodyDedicatedHostClusters setDedicatedHostCluster(java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster> dedicatedHostCluster) {
            this.dedicatedHostCluster = dedicatedHostCluster;
            return this;
        }
        public java.util.List<DescribeDedicatedHostClustersResponseBodyDedicatedHostClustersDedicatedHostCluster> getDedicatedHostCluster() {
            return this.dedicatedHostCluster;
        }

    }

}
