// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeScheduleHostResponseBody extends TeaModel {
    @NameInMap("ScheduleId")
    public String scheduleId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HostScheduleStatusList")
    public java.util.List<DescribeScheduleHostResponseBodyHostScheduleStatusList> hostScheduleStatusList;

    public static DescribeScheduleHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduleHostResponseBody self = new DescribeScheduleHostResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScheduleHostResponseBody setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public DescribeScheduleHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScheduleHostResponseBody setHostScheduleStatusList(java.util.List<DescribeScheduleHostResponseBodyHostScheduleStatusList> hostScheduleStatusList) {
        this.hostScheduleStatusList = hostScheduleStatusList;
        return this;
    }
    public java.util.List<DescribeScheduleHostResponseBodyHostScheduleStatusList> getHostScheduleStatusList() {
        return this.hostScheduleStatusList;
    }

    public static class DescribeScheduleHostResponseBodyHostScheduleStatusList extends TeaModel {
        @NameInMap("ScheduleStatus")
        public String scheduleStatus;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        @NameInMap("InstanceOutId")
        public String instanceOutId;

        @NameInMap("InstanceInId")
        public String instanceInId;

        public static DescribeScheduleHostResponseBodyHostScheduleStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScheduleHostResponseBodyHostScheduleStatusList self = new DescribeScheduleHostResponseBodyHostScheduleStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeScheduleHostResponseBodyHostScheduleStatusList setScheduleStatus(String scheduleStatus) {
            this.scheduleStatus = scheduleStatus;
            return this;
        }
        public String getScheduleStatus() {
            return this.scheduleStatus;
        }

        public DescribeScheduleHostResponseBodyHostScheduleStatusList setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeScheduleHostResponseBodyHostScheduleStatusList setInstanceOutId(String instanceOutId) {
            this.instanceOutId = instanceOutId;
            return this;
        }
        public String getInstanceOutId() {
            return this.instanceOutId;
        }

        public DescribeScheduleHostResponseBodyHostScheduleStatusList setInstanceInId(String instanceInId) {
            this.instanceInId = instanceInId;
            return this;
        }
        public String getInstanceInId() {
            return this.instanceInId;
        }

    }

}
