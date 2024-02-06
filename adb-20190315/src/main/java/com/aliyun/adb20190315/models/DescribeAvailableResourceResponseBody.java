// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    /**
     * <p>The supported zones.</p>
     */
    @NameInMap("AvailableZoneList")
    public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneList> availableZoneList;

    /**
     * <p>The resources available in the supported editions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The supported edition. Valid values:</p>
     * <br>
     * <p>*   **basic**: Basic Edition</p>
     * <p>*   **cluster**: Cluster Edition</p>
     * <p>*   **mixed_storage**: elastic mode for Cluster Edition</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponseBody self = new DescribeAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponseBody setAvailableZoneList(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneList> availableZoneList) {
        this.availableZoneList = availableZoneList;
        return this;
    }
    public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneList> getAvailableZoneList() {
        return this.availableZoneList;
    }

    public DescribeAvailableResourceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource extends TeaModel {
        /**
         * <p>The maximum amount of elastic I/O resources.</p>
         */
        @NameInMap("MaxCount")
        public String maxCount;

        /**
         * <p>The minimum amount of elastic I/O resources.</p>
         */
        @NameInMap("MinCount")
        public String minCount;

        /**
         * <p>The step size.</p>
         */
        @NameInMap("Step")
        public String step;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource self = new DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource setMinCount(String minCount) {
            this.minCount = minCount;
            return this;
        }
        public String getMinCount() {
            return this.minCount;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource extends TeaModel {
        /**
         * <p>The disk storage type. Valid values:</p>
         * <br>
         * <p>*   **hdd**</p>
         * <p>*   **ssd**</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The supported computing resources.</p>
         */
        @NameInMap("SupportedComputeResource")
        public java.util.List<String> supportedComputeResource;

        /**
         * <p>The supported elastic I/O resources.</p>
         */
        @NameInMap("SupportedElasticIOResource")
        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResourceSupportedElasticIOResource supportedElasticIOResource;

        /**
         * <p>The supported storage resources.</p>
         */
        @NameInMap("SupportedStorageResource")
        public java.util.List<String> supportedStorageResource;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource self = new DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount extends TeaModel {
        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("MaxCount")
        public String maxCount;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("MinCount")
        public String minCount;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("Step")
        public String step;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount self = new DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount setMinCount(String minCount) {
            this.minCount = minCount;
            return this;
        }
        public String getMinCount() {
            return this.minCount;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorListNodeCount setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorList extends TeaModel {
        /**
         * <p>The information about the supported compute nodes.</p>
         */
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
         * <p>The step size.</p>
         */
        @NameInMap("Step")
        public String step;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount self = new DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount setMinCount(String minCount) {
            this.minCount = minCount;
            return this;
        }
        public String getMinCount() {
            return this.minCount;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountList extends TeaModel {
        /**
         * <p>The number of the supported compute nodes.</p>
         */
        @NameInMap("NodeCount")
        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountListNodeCount nodeCount;

        /**
         * <p>The support storage capacity. Unit: GB.</p>
         */
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
        /**
         * <p>The supported instance type.</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("SupportedExecutorList")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorList> supportedExecutorList;

        /**
         * <p>The supported compute nodes.</p>
         */
        @NameInMap("SupportedNodeCountList")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedNodeCountList> supportedNodeCountList;

        /**
         * <p>The description of the instance type.</p>
         */
        @NameInMap("Tips")
        public String tips;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList self = new DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList setSupportedExecutorList(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorList> supportedExecutorList) {
            this.supportedExecutorList = supportedExecutorList;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassListSupportedExecutorList> getSupportedExecutorList() {
            return this.supportedExecutorList;
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

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList extends TeaModel {
        /**
         * <p>The supported edition. Valid values:</p>
         * <br>
         * <p>*   **basic**: Basic Edition.</p>
         * <p>*   **cluster**: Cluster Edition.</p>
         * <p>*   **mixed_storage**: elastic mode for Cluster Edition.</p>
         */
        @NameInMap("Serial")
        public String serial;

        /**
         * <p>The supported resources in elastic mode.</p>
         */
        @NameInMap("SupportedFlexibleResource")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource> supportedFlexibleResource;

        /**
         * <p>The supported resources in reserved mode.</p>
         */
        @NameInMap("SupportedInstanceClassList")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList> supportedInstanceClassList;

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

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList setSupportedFlexibleResource(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource> supportedFlexibleResource) {
            this.supportedFlexibleResource = supportedFlexibleResource;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedFlexibleResource> getSupportedFlexibleResource() {
            return this.supportedFlexibleResource;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList setSupportedInstanceClassList(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList> supportedInstanceClassList) {
            this.supportedInstanceClassList = supportedInstanceClassList;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialListSupportedInstanceClassList> getSupportedInstanceClassList() {
            return this.supportedInstanceClassList;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode extends TeaModel {
        /**
         * <p>The supported mode. Valid values:</p>
         * <br>
         * <p>*   **flexible**: elastic mode.</p>
         * <p>*   **reserver**: reserved mode.</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The supported editions.</p>
         */
        @NameInMap("SupportedSerialList")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList> supportedSerialList;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode self = new DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode setSupportedSerialList(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList> supportedSerialList) {
            this.supportedSerialList = supportedSerialList;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedModeSupportedSerialList> getSupportedSerialList() {
            return this.supportedSerialList;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneList extends TeaModel {
        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("SupportedComputeResource")
        public java.util.List<String> supportedComputeResource;

        /**
         * <p>The supported modes.</p>
         */
        @NameInMap("SupportedMode")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode> supportedMode;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("SupportedStorageResource")
        public java.util.List<String> supportedStorageResource;

        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAvailableResourceResponseBodyAvailableZoneList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneList self = new DescribeAvailableResourceResponseBodyAvailableZoneList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneList setSupportedComputeResource(java.util.List<String> supportedComputeResource) {
            this.supportedComputeResource = supportedComputeResource;
            return this;
        }
        public java.util.List<String> getSupportedComputeResource() {
            return this.supportedComputeResource;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneList setSupportedMode(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode> supportedMode) {
            this.supportedMode = supportedMode;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListSupportedMode> getSupportedMode() {
            return this.supportedMode;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneList setSupportedStorageResource(java.util.List<String> supportedStorageResource) {
            this.supportedStorageResource = supportedStorageResource;
            return this;
        }
        public java.util.List<String> getSupportedStorageResource() {
            return this.supportedStorageResource;
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
