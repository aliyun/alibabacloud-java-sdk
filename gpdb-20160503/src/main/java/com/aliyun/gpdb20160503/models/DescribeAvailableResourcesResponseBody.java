// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourcesResponseBody extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Step")
        public String step;

        @NameInMap("MinCount")
        public String minCount;

        @NameInMap("MaxCount")
        public String maxCount;

        public static DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount self = new DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount setMinCount(String minCount) {
            this.minCount = minCount;
            return this;
        }
        public String getMinCount() {
            return this.minCount;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

    }

    public static class DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize extends TeaModel {
        @NameInMap("Step")
        public String step;

        @NameInMap("MinCount")
        public String minCount;

        @NameInMap("MaxCount")
        public String maxCount;

        public static DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize self = new DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize setMinCount(String minCount) {
            this.minCount = minCount;
            return this;
        }
        public String getMinCount() {
            return this.minCount;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

    }

    public static class DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses extends TeaModel {
        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayClass")
        public String displayClass;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("NodeCount")
        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesNodeCount nodeCount;

        @NameInMap("StorageSize")
        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClassesStorageSize storageSize;

        public static DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses self = new DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
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

    }

    public static class DescribeAvailableResourcesResponseBodyResourcesSupportedEngines extends TeaModel {
        @NameInMap("SupportedEngineVersion")
        public String supportedEngineVersion;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("SupportedInstanceClasses")
        public java.util.List<DescribeAvailableResourcesResponseBodyResourcesSupportedEnginesSupportedInstanceClasses> supportedInstanceClasses;

        public static DescribeAvailableResourcesResponseBodyResourcesSupportedEngines build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourcesResponseBodyResourcesSupportedEngines self = new DescribeAvailableResourcesResponseBodyResourcesSupportedEngines();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEngines setSupportedEngineVersion(String supportedEngineVersion) {
            this.supportedEngineVersion = supportedEngineVersion;
            return this;
        }
        public String getSupportedEngineVersion() {
            return this.supportedEngineVersion;
        }

        public DescribeAvailableResourcesResponseBodyResourcesSupportedEngines setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
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
        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("SupportedEngines")
        public java.util.List<DescribeAvailableResourcesResponseBodyResourcesSupportedEngines> supportedEngines;

        public static DescribeAvailableResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourcesResponseBodyResources self = new DescribeAvailableResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourcesResponseBodyResources setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeAvailableResourcesResponseBodyResources setSupportedEngines(java.util.List<DescribeAvailableResourcesResponseBodyResourcesSupportedEngines> supportedEngines) {
            this.supportedEngines = supportedEngines;
            return this;
        }
        public java.util.List<DescribeAvailableResourcesResponseBodyResourcesSupportedEngines> getSupportedEngines() {
            return this.supportedEngines;
        }

    }

}
