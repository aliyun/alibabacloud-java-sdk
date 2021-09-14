// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeScheduleInstanceResponseBody extends TeaModel {
    @NameInMap("ScheduleId")
    public String scheduleId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceScheduleStatusList")
    public java.util.List<DescribeScheduleInstanceResponseBodyInstanceScheduleStatusList> instanceScheduleStatusList;

    public static DescribeScheduleInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduleInstanceResponseBody self = new DescribeScheduleInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScheduleInstanceResponseBody setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public DescribeScheduleInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScheduleInstanceResponseBody setInstanceScheduleStatusList(java.util.List<DescribeScheduleInstanceResponseBodyInstanceScheduleStatusList> instanceScheduleStatusList) {
        this.instanceScheduleStatusList = instanceScheduleStatusList;
        return this;
    }
    public java.util.List<DescribeScheduleInstanceResponseBodyInstanceScheduleStatusList> getInstanceScheduleStatusList() {
        return this.instanceScheduleStatusList;
    }

    public static class DescribeScheduleInstanceResponseBodyInstanceScheduleStatusList extends TeaModel {
        @NameInMap("ScheduleStatus")
        public String scheduleStatus;

        @NameInMap("InstanceNodeTargetHostId")
        public String instanceNodeTargetHostId;

        @NameInMap("InstanceNodeRole")
        public String instanceNodeRole;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceNodeSourceHostId")
        public String instanceNodeSourceHostId;

        public static DescribeScheduleInstanceResponseBodyInstanceScheduleStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScheduleInstanceResponseBodyInstanceScheduleStatusList self = new DescribeScheduleInstanceResponseBodyInstanceScheduleStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeScheduleInstanceResponseBodyInstanceScheduleStatusList setScheduleStatus(String scheduleStatus) {
            this.scheduleStatus = scheduleStatus;
            return this;
        }
        public String getScheduleStatus() {
            return this.scheduleStatus;
        }

        public DescribeScheduleInstanceResponseBodyInstanceScheduleStatusList setInstanceNodeTargetHostId(String instanceNodeTargetHostId) {
            this.instanceNodeTargetHostId = instanceNodeTargetHostId;
            return this;
        }
        public String getInstanceNodeTargetHostId() {
            return this.instanceNodeTargetHostId;
        }

        public DescribeScheduleInstanceResponseBodyInstanceScheduleStatusList setInstanceNodeRole(String instanceNodeRole) {
            this.instanceNodeRole = instanceNodeRole;
            return this;
        }
        public String getInstanceNodeRole() {
            return this.instanceNodeRole;
        }

        public DescribeScheduleInstanceResponseBodyInstanceScheduleStatusList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeScheduleInstanceResponseBodyInstanceScheduleStatusList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeScheduleInstanceResponseBodyInstanceScheduleStatusList setInstanceNodeSourceHostId(String instanceNodeSourceHostId) {
            this.instanceNodeSourceHostId = instanceNodeSourceHostId;
            return this;
        }
        public String getInstanceNodeSourceHostId() {
            return this.instanceNodeSourceHostId;
        }

    }

}
