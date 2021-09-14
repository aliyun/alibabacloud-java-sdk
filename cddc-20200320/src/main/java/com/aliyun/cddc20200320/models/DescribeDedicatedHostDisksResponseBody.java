// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostDisksResponseBody extends TeaModel {
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Disks")
    public java.util.List<DescribeDedicatedHostDisksResponseBodyDisks> disks;

    public static DescribeDedicatedHostDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostDisksResponseBody self = new DescribeDedicatedHostDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostDisksResponseBody setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public DescribeDedicatedHostDisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostDisksResponseBody setDisks(java.util.List<DescribeDedicatedHostDisksResponseBodyDisks> disks) {
        this.disks = disks;
        return this;
    }
    public java.util.List<DescribeDedicatedHostDisksResponseBodyDisks> getDisks() {
        return this.disks;
    }

    public static class DescribeDedicatedHostDisksResponseBodyDisks extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("MaxThroughput")
        public Integer maxThroughput;

        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        @NameInMap("HasDBInstance")
        public Boolean hasDBInstance;

        @NameInMap("Device")
        public String device;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Category")
        public String category;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static DescribeDedicatedHostDisksResponseBodyDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostDisksResponseBodyDisks self = new DescribeDedicatedHostDisksResponseBodyDisks();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostDisksResponseBodyDisks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDedicatedHostDisksResponseBodyDisks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDedicatedHostDisksResponseBodyDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeDedicatedHostDisksResponseBodyDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDedicatedHostDisksResponseBodyDisks setMaxThroughput(Integer maxThroughput) {
            this.maxThroughput = maxThroughput;
            return this;
        }
        public Integer getMaxThroughput() {
            return this.maxThroughput;
        }

        public DescribeDedicatedHostDisksResponseBodyDisks setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDedicatedHostDisksResponseBodyDisks setHasDBInstance(Boolean hasDBInstance) {
            this.hasDBInstance = hasDBInstance;
            return this;
        }
        public Boolean getHasDBInstance() {
            return this.hasDBInstance;
        }

        public DescribeDedicatedHostDisksResponseBodyDisks setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDedicatedHostDisksResponseBodyDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeDedicatedHostDisksResponseBodyDisks setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDedicatedHostDisksResponseBodyDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDedicatedHostDisksResponseBodyDisks setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

}
