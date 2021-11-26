// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    @NameInMap("AvailableZoneList")
    public DescribeAvailableResourceResponseBodyAvailableZoneList availableZoneList;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponseBody self = new DescribeAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponseBody setAvailableZoneList(DescribeAvailableResourceResponseBodyAvailableZoneList availableZoneList) {
        this.availableZoneList = availableZoneList;
        return this;
    }
    public DescribeAvailableResourceResponseBodyAvailableZoneList getAvailableZoneList() {
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

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount extends TeaModel {
        @NameInMap("MaxCount")
        public String maxCount;

        @NameInMap("MinCount")
        public String minCount;

        @NameInMap("Step")
        public String step;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount self = new DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount setMinCount(String minCount) {
            this.minCount = minCount;
            return this;
        }
        public String getMinCount() {
            return this.minCount;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor extends TeaModel {
        @NameInMap("NodeCount")
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount nodeCount;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor self = new DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor setNodeCount(DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutorNodeCount getNodeCount() {
            return this.nodeCount;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList extends TeaModel {
        @NameInMap("SupportedExecutor")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor> supportedExecutor;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList self = new DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList setSupportedExecutor(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor> supportedExecutor) {
            this.supportedExecutor = supportedExecutor;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorListSupportedExecutor> getSupportedExecutor() {
            return this.supportedExecutor;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount extends TeaModel {
        @NameInMap("MaxCount")
        public String maxCount;

        @NameInMap("MinCount")
        public String minCount;

        @NameInMap("Step")
        public String step;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount self = new DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount setMinCount(String minCount) {
            this.minCount = minCount;
            return this;
        }
        public String getMinCount() {
            return this.minCount;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize extends TeaModel {
        @NameInMap("StorageSize")
        public java.util.List<String> storageSize;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize self = new DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize setStorageSize(java.util.List<String> storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public java.util.List<String> getStorageSize() {
            return this.storageSize;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount extends TeaModel {
        @NameInMap("NodeCount")
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount nodeCount;

        @NameInMap("StorageSize")
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize storageSize;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount self = new DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount setNodeCount(DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountNodeCount getNodeCount() {
            return this.nodeCount;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount setStorageSize(DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCountStorageSize getStorageSize() {
            return this.storageSize;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList extends TeaModel {
        @NameInMap("SupportedNodeCount")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount> supportedNodeCount;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList self = new DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList setSupportedNodeCount(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount> supportedNodeCount) {
            this.supportedNodeCount = supportedNodeCount;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountListSupportedNodeCount> getSupportedNodeCount() {
            return this.supportedNodeCount;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass extends TeaModel {
        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("SupportedExecutorList")
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList supportedExecutorList;

        @NameInMap("SupportedNodeCountList")
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList supportedNodeCountList;

        @NameInMap("Tips")
        public String tips;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass self = new DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass setSupportedExecutorList(DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList supportedExecutorList) {
            this.supportedExecutorList = supportedExecutorList;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedExecutorList getSupportedExecutorList() {
            return this.supportedExecutorList;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass setSupportedNodeCountList(DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList supportedNodeCountList) {
            this.supportedNodeCountList = supportedNodeCountList;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedNodeCountList getSupportedNodeCountList() {
            return this.supportedNodeCountList;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList extends TeaModel {
        @NameInMap("SupportedInstanceClass")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass> supportedInstanceClass;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList self = new DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList setSupportedInstanceClass(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass> supportedInstanceClass) {
            this.supportedInstanceClass = supportedInstanceClass;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass> getSupportedInstanceClass() {
            return this.supportedInstanceClass;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial extends TeaModel {
        @NameInMap("Serial")
        public String serial;

        @NameInMap("SupportedInstanceClassList")
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList supportedInstanceClassList;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial self = new DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial setSerial(String serial) {
            this.serial = serial;
            return this;
        }
        public String getSerial() {
            return this.serial;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial setSupportedInstanceClassList(DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList supportedInstanceClassList) {
            this.supportedInstanceClassList = supportedInstanceClassList;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassList getSupportedInstanceClassList() {
            return this.supportedInstanceClassList;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialList extends TeaModel {
        @NameInMap("SupportedSerial")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial> supportedSerial;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialList self = new DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialList setSupportedSerial(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial> supportedSerial) {
            this.supportedSerial = supportedSerial;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerial> getSupportedSerial() {
            return this.supportedSerial;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZone extends TeaModel {
        @NameInMap("SupportedSerialList")
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialList supportedSerialList;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZone self = new DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZone();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZone setSupportedSerialList(DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialList supportedSerialList) {
            this.supportedSerialList = supportedSerialList;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialList getSupportedSerialList() {
            return this.supportedSerialList;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneList extends TeaModel {
        @NameInMap("AvailableZone")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZone> availableZone;

        public static DescribeAvailableResourceResponseBodyAvailableZoneList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneList self = new DescribeAvailableResourceResponseBodyAvailableZoneList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneList setAvailableZone(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZone> availableZone) {
            this.availableZone = availableZone;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZone> getAvailableZone() {
            return this.availableZone;
        }

    }

}
