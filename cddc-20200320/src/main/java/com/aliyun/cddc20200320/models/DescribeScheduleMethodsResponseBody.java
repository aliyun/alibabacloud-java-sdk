// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeScheduleMethodsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScheduleMethodList")
    public java.util.List<DescribeScheduleMethodsResponseBodyScheduleMethodList> scheduleMethodList;

    public static DescribeScheduleMethodsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduleMethodsResponseBody self = new DescribeScheduleMethodsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScheduleMethodsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScheduleMethodsResponseBody setScheduleMethodList(java.util.List<DescribeScheduleMethodsResponseBodyScheduleMethodList> scheduleMethodList) {
        this.scheduleMethodList = scheduleMethodList;
        return this;
    }
    public java.util.List<DescribeScheduleMethodsResponseBodyScheduleMethodList> getScheduleMethodList() {
        return this.scheduleMethodList;
    }

    public static class DescribeScheduleMethodsResponseBodyScheduleMethodList extends TeaModel {
        @NameInMap("ZonesOrder")
        public String zonesOrder;

        @NameInMap("ZoneDistribution")
        public String zoneDistribution;

        @NameInMap("CPUUtilityThreshold")
        public Integer CPUUtilityThreshold;

        @NameInMap("DedicatedHostGroupDesc")
        public String dedicatedHostGroupDesc;

        @NameInMap("MemoryUtilityThreshold")
        public Integer memoryUtilityThreshold;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("InstanceDistribution")
        public String instanceDistribution;

        @NameInMap("LocalDiskUtilityThreshold")
        public Integer localDiskUtilityThreshold;

        @NameInMap("DedicatedHostGroupId")
        public String dedicatedHostGroupId;

        public static DescribeScheduleMethodsResponseBodyScheduleMethodList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScheduleMethodsResponseBodyScheduleMethodList self = new DescribeScheduleMethodsResponseBodyScheduleMethodList();
            return TeaModel.build(map, self);
        }

        public DescribeScheduleMethodsResponseBodyScheduleMethodList setZonesOrder(String zonesOrder) {
            this.zonesOrder = zonesOrder;
            return this;
        }
        public String getZonesOrder() {
            return this.zonesOrder;
        }

        public DescribeScheduleMethodsResponseBodyScheduleMethodList setZoneDistribution(String zoneDistribution) {
            this.zoneDistribution = zoneDistribution;
            return this;
        }
        public String getZoneDistribution() {
            return this.zoneDistribution;
        }

        public DescribeScheduleMethodsResponseBodyScheduleMethodList setCPUUtilityThreshold(Integer CPUUtilityThreshold) {
            this.CPUUtilityThreshold = CPUUtilityThreshold;
            return this;
        }
        public Integer getCPUUtilityThreshold() {
            return this.CPUUtilityThreshold;
        }

        public DescribeScheduleMethodsResponseBodyScheduleMethodList setDedicatedHostGroupDesc(String dedicatedHostGroupDesc) {
            this.dedicatedHostGroupDesc = dedicatedHostGroupDesc;
            return this;
        }
        public String getDedicatedHostGroupDesc() {
            return this.dedicatedHostGroupDesc;
        }

        public DescribeScheduleMethodsResponseBodyScheduleMethodList setMemoryUtilityThreshold(Integer memoryUtilityThreshold) {
            this.memoryUtilityThreshold = memoryUtilityThreshold;
            return this;
        }
        public Integer getMemoryUtilityThreshold() {
            return this.memoryUtilityThreshold;
        }

        public DescribeScheduleMethodsResponseBodyScheduleMethodList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeScheduleMethodsResponseBodyScheduleMethodList setInstanceDistribution(String instanceDistribution) {
            this.instanceDistribution = instanceDistribution;
            return this;
        }
        public String getInstanceDistribution() {
            return this.instanceDistribution;
        }

        public DescribeScheduleMethodsResponseBodyScheduleMethodList setLocalDiskUtilityThreshold(Integer localDiskUtilityThreshold) {
            this.localDiskUtilityThreshold = localDiskUtilityThreshold;
            return this;
        }
        public Integer getLocalDiskUtilityThreshold() {
            return this.localDiskUtilityThreshold;
        }

        public DescribeScheduleMethodsResponseBodyScheduleMethodList setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

    }

}
