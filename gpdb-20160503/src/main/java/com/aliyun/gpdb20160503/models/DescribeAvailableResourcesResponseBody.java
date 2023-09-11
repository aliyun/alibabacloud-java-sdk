// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourcesResponseBody extends TeaModel {
    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The zone ID.</p>
     */
    @NameInMap("Resources")
    public java.util.List<DescribeAvailableResourcesResponseBodyResources> resources;

    public static DescribeAvailableResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourcesResponseBody self = new DescribeAvailableResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourcesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableResourcesResponseBody setResources(java.util.List<DescribeAvailableResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<DescribeAvailableResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount extends TeaModel {
        /**
         * <p>The maximum number of compute nodes.</p>
         */
        @NameInMap("MaxCount")
        public String maxCount;

        /**
         * <p>The minimum number of compute nodes.</p>
         */
        @NameInMap("MinCount")
        public String minCount;

        /**
         * <p>The step size for adding compute nodes.</p>
         * <br>
         * <p>For example, if the value of this parameter is 4, compute nodes must be added by multiples of 4.</p>
         */
        @NameInMap("Step")
        public String step;

        public static DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount self = new DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount setMinCount(String minCount) {
            this.minCount = minCount;
            return this;
        }
        public String getMinCount() {
            return this.minCount;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

    }

    public static class DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize extends TeaModel {
        /**
         * <p>The maximum storage capacity of each compute node.</p>
         */
        @NameInMap("MaxCount")
        public String maxCount;

        /**
         * <p>The minimum storage capacity of each compute node.</p>
         */
        @NameInMap("MinCount")
        public String minCount;

        /**
         * <p>The step size for adding storage capacity for compute nodes.</p>
         */
        @NameInMap("Step")
        public String step;

        public static DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize self = new DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize setMinCount(String minCount) {
            this.minCount = minCount;
            return this;
        }
        public String getMinCount() {
            return this.minCount;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

    }

    public static class DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses extends TeaModel {
        /**
         * <p>The instance edition. Valid values:</p>
         * <br>
         * <p>*   **HighAvailability**: High-availability Edition</p>
         * <p>*   **Basic**: Basic Edition</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The description of compute node specifications.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The specifications of each compute node.</p>
         */
        @NameInMap("DisplayClass")
        public String displayClass;

        /**
         * <p>The specifications of each compute node.</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>Details about the compute nodes.</p>
         */
        @NameInMap("NodeCount")
        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount nodeCount;

        /**
         * <p>Details about the storage capacity of compute nodes.</p>
         */
        @NameInMap("StorageSize")
        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize storageSize;

        /**
         * <p>The storage type. Valid values:</p>
         * <br>
         * <p>*   **cloud_essd**: enhanced SSD (ESSD)</p>
         * <p>*   **cloud_efficiency**: ultra disk</p>
         * <p>*   **oss**: Object Storage Service (OSS)</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses self = new DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses setDisplayClass(String displayClass) {
            this.displayClass = displayClass;
            return this;
        }
        public String getDisplayClass() {
            return this.displayClass;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses setNodeCount(DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount getNodeCount() {
            return this.nodeCount;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses setStorageSize(DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize getStorageSize() {
            return this.storageSize;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class DescribeAvailableResourcesResponseBodyResourcesSupportedEngines extends TeaModel {
        /**
         * <p>The instance resource type. Valid values:</p>
         * <br>
         * <p>*   **ecs**: elastic storage mode</p>
         * <p>*   **serverless**: Serverless mode</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The available engine version.</p>
         */
        @NameInMap("SupportedEngineVersion")
        public String supportedEngineVersion;

        /**
         * <p>The available specifications.</p>
         */
        @NameInMap("SupportedInstanceClasses")
        public java.util.List<DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses> supportedInstanceClasses;

        public static DescribeAvailableResourcesResponseBodyResourcesSupportedEngines build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourcesResponseBodyResourcesSupportedEngines self = new DescribeAvailableResourcesResponseBodyResourcesSupportedEngines();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEngines setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEngines setSupportedEngineVersion(String supportedEngineVersion) {
            this.supportedEngineVersion = supportedEngineVersion;
            return this;
        }
        public String getSupportedEngineVersion() {
            return this.supportedEngineVersion;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEngines setSupportedInstanceClasses(java.util.List<DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses> supportedInstanceClasses) {
            this.supportedInstanceClasses = supportedInstanceClasses;
            return this;
        }
        public java.util.List<DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses> getSupportedInstanceClasses() {
            return this.supportedInstanceClasses;
        }

    }

    public static class DescribeAvailableResourcesResponseBodyResources extends TeaModel {
        /**
         * <p>The available engine version and specifications.</p>
         */
        @NameInMap("SupportedEngines")
        public java.util.List<DescribeAvailableResourcesResponseBodyResourcesSupportedEngines> supportedEngines;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAvailableResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourcesResponseBodyResources self = new DescribeAvailableResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourcesResponseBodyResources setSupportedEngines(java.util.List<DescribeAvailableResourcesResponseBodyResourcesSupportedEngines> supportedEngines) {
            this.supportedEngines = supportedEngines;
            return this;
        }
        public java.util.List<DescribeAvailableResourcesResponseBodyResourcesSupportedEngines> getSupportedEngines() {
            return this.supportedEngines;
        }

        public DescribeAvailableResourcesResponseBodyResources setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
