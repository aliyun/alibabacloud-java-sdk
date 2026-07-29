// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gdb20190903.models;

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

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSizeStorageSize extends TeaModel {
        @NameInMap("Max")
        public Integer max;

        @NameInMap("Min")
        public Integer min;

        @NameInMap("Step")
        public Integer step;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSizeStorageSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSizeStorageSize self = new DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSizeStorageSize();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSizeStorageSize setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSizeStorageSize setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSizeStorageSize setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSize extends TeaModel {
        @NameInMap("StorageSize")
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSizeStorageSize storageSize;

        @NameInMap("StorageType")
        public String storageType;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSize self = new DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSize();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSize setStorageSize(DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSizeStorageSize storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSizeStorageSize getStorageSize() {
            return this.storageSize;
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSize setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeList extends TeaModel {
        @NameInMap("SupportedStorageSize")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSize> supportedStorageSize;

        public static DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeList self = new DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeList();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeList setSupportedStorageSize(java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSize> supportedStorageSize) {
            this.supportedStorageSize = supportedStorageSize;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeListSupportedStorageSize> getSupportedStorageSize() {
            return this.supportedStorageSize;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass extends TeaModel {
        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("SupportedStorageSizeList")
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeList supportedStorageSizeList;

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

        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClass setSupportedStorageSizeList(DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeList supportedStorageSizeList) {
            this.supportedStorageSizeList = supportedStorageSizeList;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZoneListAvailableZoneSupportedSerialListSupportedSerialSupportedInstanceClassListSupportedInstanceClassSupportedStorageSizeList getSupportedStorageSizeList() {
            return this.supportedStorageSizeList;
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
