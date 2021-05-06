// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AvailableZoneList")
    public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneList> availableZoneList;

    public static DescribeAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponseBody self = new DescribeAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableResourceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableResourceResponseBody setAvailableZoneList(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneList> availableZoneList) {
        this.availableZoneList = availableZoneList;
        return this;
    }
    public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneList> getAvailableZoneList() {
        return this.availableZoneList;
    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount extends TeaModel {
        @NameInMap("Step")
        public String step;

        @NameInMap("MinCount")
        public String minCount;

        @NameInMap("MaxCount")
        public String maxCount;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount self = new DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount setMinCount(String minCount) {
            this.minCount = minCount;
            return this;
        }
        public String getMinCount() {
            return this.minCount;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorList extends TeaModel {
        @NameInMap("NodeCount")
        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount nodeCount;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorList self = new DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorList setNodeCount(DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount getNodeCount() {
            return this.nodeCount;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount extends TeaModel {
        @NameInMap("Step")
        public String step;

        @NameInMap("MinCount")
        public String minCount;

        @NameInMap("MaxCount")
        public String maxCount;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount self = new DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount setMinCount(String minCount) {
            this.minCount = minCount;
            return this;
        }
        public String getMinCount() {
            return this.minCount;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountList extends TeaModel {
        @NameInMap("NodeCount")
        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount nodeCount;

        @NameInMap("StorageSize")
        public java.util.List<String> storageSize;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountList self = new DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountList setNodeCount(DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount getNodeCount() {
            return this.nodeCount;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountList setStorageSize(java.util.List<String> storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public java.util.List<String> getStorageSize() {
            return this.storageSize;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList extends TeaModel {
        @NameInMap("SupportedExecutorList")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorList> supportedExecutorList;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("SupportedNodeCountList")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountList> supportedNodeCountList;

        @NameInMap("Tips")
        public String tips;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList self = new DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList setSupportedExecutorList(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorList> supportedExecutorList) {
            this.supportedExecutorList = supportedExecutorList;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorList> getSupportedExecutorList() {
            return this.supportedExecutorList;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList setSupportedNodeCountList(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountList> supportedNodeCountList) {
            this.supportedNodeCountList = supportedNodeCountList;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountList> getSupportedNodeCountList() {
            return this.supportedNodeCountList;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource extends TeaModel {
        @NameInMap("Step")
        public String step;

        @NameInMap("MinCount")
        public String minCount;

        @NameInMap("MaxCount")
        public String maxCount;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource self = new DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource setMinCount(String minCount) {
            this.minCount = minCount;
            return this;
        }
        public String getMinCount() {
            return this.minCount;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource extends TeaModel {
        @NameInMap("SupportedElasticIOResource")
        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource supportedElasticIOResource;

        @NameInMap("SupportedStorageResource")
        public java.util.List<String> supportedStorageResource;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("SupportedComputeResource")
        public java.util.List<String> supportedComputeResource;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource self = new DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource setSupportedElasticIOResource(DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource supportedElasticIOResource) {
            this.supportedElasticIOResource = supportedElasticIOResource;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource getSupportedElasticIOResource() {
            return this.supportedElasticIOResource;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource setSupportedStorageResource(java.util.List<String> supportedStorageResource) {
            this.supportedStorageResource = supportedStorageResource;
            return this;
        }
        public java.util.List<String> getSupportedStorageResource() {
            return this.supportedStorageResource;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource setSupportedComputeResource(java.util.List<String> supportedComputeResource) {
            this.supportedComputeResource = supportedComputeResource;
            return this;
        }
        public java.util.List<String> getSupportedComputeResource() {
            return this.supportedComputeResource;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList extends TeaModel {
        @NameInMap("Serial")
        public String serial;

        @NameInMap("SupportedInstanceClassList")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList> supportedInstanceClassList;

        @NameInMap("SupportedFlexibleResource")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource> supportedFlexibleResource;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList self = new DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList setSerial(String serial) {
            this.serial = serial;
            return this;
        }
        public String getSerial() {
            return this.serial;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList setSupportedInstanceClassList(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList> supportedInstanceClassList) {
            this.supportedInstanceClassList = supportedInstanceClassList;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList> getSupportedInstanceClassList() {
            return this.supportedInstanceClassList;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList setSupportedFlexibleResource(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource> supportedFlexibleResource) {
            this.supportedFlexibleResource = supportedFlexibleResource;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource> getSupportedFlexibleResource() {
            return this.supportedFlexibleResource;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode extends TeaModel {
        @NameInMap("SupportedSerialList")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList> supportedSerialList;

        @NameInMap("Mode")
        public String mode;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode self = new DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode setSupportedSerialList(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList> supportedSerialList) {
            this.supportedSerialList = supportedSerialList;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList> getSupportedSerialList() {
            return this.supportedSerialList;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneList extends TeaModel {
        @NameInMap("SupportedMode")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode> supportedMode;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAvailableResourceResponseBodyAvailableZoneList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneList self = new DescribeAvailableResourceResponseBodyAvailableZoneList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneList setSupportedMode(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode> supportedMode) {
            this.supportedMode = supportedMode;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode> getSupportedMode() {
            return this.supportedMode;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
