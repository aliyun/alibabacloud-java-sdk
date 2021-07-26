// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateScheduleDutyRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源一级ID
    @NameInMap("ScheduleDutyId")
    public String scheduleDutyId;

    // typeWorkerList
    @NameInMap("TypeWorkerList")
    public java.util.List<UpdateScheduleDutyRequestTypeWorkerList> typeWorkerList;

    public static UpdateScheduleDutyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleDutyRequest self = new UpdateScheduleDutyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleDutyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateScheduleDutyRequest setScheduleDutyId(String scheduleDutyId) {
        this.scheduleDutyId = scheduleDutyId;
        return this;
    }
    public String getScheduleDutyId() {
        return this.scheduleDutyId;
    }

    public UpdateScheduleDutyRequest setTypeWorkerList(java.util.List<UpdateScheduleDutyRequestTypeWorkerList> typeWorkerList) {
        this.typeWorkerList = typeWorkerList;
        return this;
    }
    public java.util.List<UpdateScheduleDutyRequestTypeWorkerList> getTypeWorkerList() {
        return this.typeWorkerList;
    }

    public static class UpdateScheduleDutyRequestTypeWorkerList extends TeaModel {
        // scheduleTypeId
        @NameInMap("ScheduleTypeId")
        public String scheduleTypeId;

        // 值班人员姓名
        @NameInMap("ScheduleWorkerName")
        public java.util.List<String> scheduleWorkerName;

        public static UpdateScheduleDutyRequestTypeWorkerList build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleDutyRequestTypeWorkerList self = new UpdateScheduleDutyRequestTypeWorkerList();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleDutyRequestTypeWorkerList setScheduleTypeId(String scheduleTypeId) {
            this.scheduleTypeId = scheduleTypeId;
            return this;
        }
        public String getScheduleTypeId() {
            return this.scheduleTypeId;
        }

        public UpdateScheduleDutyRequestTypeWorkerList setScheduleWorkerName(java.util.List<String> scheduleWorkerName) {
            this.scheduleWorkerName = scheduleWorkerName;
            return this;
        }
        public java.util.List<String> getScheduleWorkerName() {
            return this.scheduleWorkerName;
        }

    }

}
