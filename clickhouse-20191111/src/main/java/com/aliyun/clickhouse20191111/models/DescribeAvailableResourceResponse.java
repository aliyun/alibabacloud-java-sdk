// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AvailableZoneList")
    @Validation(required = true)
    public DescribeAvailableResourceResponseAvailableZoneList availableZoneList;

    public static DescribeAvailableResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponse self = new DescribeAvailableResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableResourceResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableResourceResponse setAvailableZoneList(DescribeAvailableResourceResponseAvailableZoneList availableZoneList) {
        this.availableZoneList = availableZoneList;
        return this;
    }
    public DescribeAvailableResourceResponseAvailableZoneList getAvailableZoneList() {
        return this.availableZoneList;
    }

    public static class DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount extends TeaModel {
        @NameInMap("MinCount")
        @Validation(required = true)
        public String minCount;

        @NameInMap("MaxCount")
        @Validation(required = true)
        public String maxCount;

        @NameInMap("Step")
        @Validation(required = true)
        public String step;

        public static DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount self = new DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount setMinCount(String minCount) {
            this.minCount = minCount;
            return this;
        }
        public String getMinCount() {
            return this.minCount;
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize extends TeaModel {
        // StorageSize
        @NameInMap("StorageSize")
        @Validation(required = true)
        public java.util.List<String> storageSize;

        public static DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize self = new DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize setStorageSize(java.util.List<String> storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public java.util.List<String> getStorageSize() {
            return this.storageSize;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount extends TeaModel {
        @NameInMap("NodeCount")
        @Validation(required = true)
        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount nodeCount;

        @NameInMap("StorageSize")
        @Validation(required = true)
        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize storageSize;

        public static DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount self = new DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount setNodeCount(DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount getNodeCount() {
            return this.nodeCount;
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount setStorageSize(DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize getStorageSize() {
            return this.storageSize;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList extends TeaModel {
        @NameInMap("SupportedNodeCount")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount> supportedNodeCount;

        public static DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList self = new DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList setSupportedNodeCount(java.util.List<DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount> supportedNodeCount) {
            this.supportedNodeCount = supportedNodeCount;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount> getSupportedNodeCount() {
            return this.supportedNodeCount;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount extends TeaModel {
        @NameInMap("MinCount")
        @Validation(required = true)
        public String minCount;

        @NameInMap("MaxCount")
        @Validation(required = true)
        public String maxCount;

        @NameInMap("Step")
        @Validation(required = true)
        public String step;

        public static DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount self = new DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount setMinCount(String minCount) {
            this.minCount = minCount;
            return this;
        }
        public String getMinCount() {
            return this.minCount;
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor extends TeaModel {
        @NameInMap("NodeCount")
        @Validation(required = true)
        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount nodeCount;

        public static DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor self = new DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor setNodeCount(DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount getNodeCount() {
            return this.nodeCount;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList extends TeaModel {
        @NameInMap("SupportedExecutor")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor> supportedExecutor;

        public static DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList self = new DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList setSupportedExecutor(java.util.List<DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor> supportedExecutor) {
            this.supportedExecutor = supportedExecutor;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor> getSupportedExecutor() {
            return this.supportedExecutor;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass extends TeaModel {
        @NameInMap("InstanceClass")
        @Validation(required = true)
        public String instanceClass;

        @NameInMap("Tips")
        @Validation(required = true)
        public String tips;

        @NameInMap("SupportedNodeCountList")
        @Validation(required = true)
        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList supportedNodeCountList;

        @NameInMap("SupportedExecutorList")
        @Validation(required = true)
        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList supportedExecutorList;

        public static DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass self = new DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass setSupportedNodeCountList(DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList supportedNodeCountList) {
            this.supportedNodeCountList = supportedNodeCountList;
            return this;
        }
        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList getSupportedNodeCountList() {
            return this.supportedNodeCountList;
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass setSupportedExecutorList(DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList supportedExecutorList) {
            this.supportedExecutorList = supportedExecutorList;
            return this;
        }
        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList getSupportedExecutorList() {
            return this.supportedExecutorList;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList extends TeaModel {
        @NameInMap("SupportedInstanceClass")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass> supportedInstanceClass;

        public static DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList self = new DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList setSupportedInstanceClass(java.util.List<DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass> supportedInstanceClass) {
            this.supportedInstanceClass = supportedInstanceClass;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass> getSupportedInstanceClass() {
            return this.supportedInstanceClass;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial extends TeaModel {
        @NameInMap("Serial")
        @Validation(required = true)
        public String serial;

        @NameInMap("SupportedInstanceClassList")
        @Validation(required = true)
        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList supportedInstanceClassList;

        public static DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial self = new DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial setSerial(String serial) {
            this.serial = serial;
            return this;
        }
        public String getSerial() {
            return this.serial;
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial setSupportedInstanceClassList(DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList supportedInstanceClassList) {
            this.supportedInstanceClassList = supportedInstanceClassList;
            return this;
        }
        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList getSupportedInstanceClassList() {
            return this.supportedInstanceClassList;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialList extends TeaModel {
        @NameInMap("SupportedSerial")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial> supportedSerial;

        public static DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialList self = new DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialList setSupportedSerial(java.util.List<DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial> supportedSerial) {
            this.supportedSerial = supportedSerial;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial> getSupportedSerial() {
            return this.supportedSerial;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZoneListAvailableZone extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("SupportedSerialList")
        @Validation(required = true)
        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialList supportedSerialList;

        public static DescribeAvailableResourceResponseAvailableZoneListAvailableZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZoneListAvailableZone self = new DescribeAvailableResourceResponseAvailableZoneListAvailableZone();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeAvailableResourceResponseAvailableZoneListAvailableZone setSupportedSerialList(DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialList supportedSerialList) {
            this.supportedSerialList = supportedSerialList;
            return this;
        }
        public DescribeAvailableResourceResponseAvailableZoneListAvailableZoneSupportedSerialList getSupportedSerialList() {
            return this.supportedSerialList;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZoneList extends TeaModel {
        @NameInMap("AvailableZone")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZoneListAvailableZone> availableZone;

        public static DescribeAvailableResourceResponseAvailableZoneList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZoneList self = new DescribeAvailableResourceResponseAvailableZoneList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZoneList setAvailableZone(java.util.List<DescribeAvailableResourceResponseAvailableZoneListAvailableZone> availableZone) {
            this.availableZone = availableZone;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseAvailableZoneListAvailableZone> getAvailableZone() {
            return this.availableZone;
        }

    }

}
