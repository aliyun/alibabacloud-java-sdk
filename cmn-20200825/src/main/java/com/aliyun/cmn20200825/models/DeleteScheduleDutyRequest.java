// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteScheduleDutyRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("ScheduleDutyId")
    public String scheduleDutyId;

    // typeWorkerList
    @NameInMap("TypeWorkerList")
    public java.util.List<DeleteScheduleDutyRequestTypeWorkerList> typeWorkerList;

    public static DeleteScheduleDutyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduleDutyRequest self = new DeleteScheduleDutyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScheduleDutyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteScheduleDutyRequest setScheduleDutyId(String scheduleDutyId) {
        this.scheduleDutyId = scheduleDutyId;
        return this;
    }
    public String getScheduleDutyId() {
        return this.scheduleDutyId;
    }

    public DeleteScheduleDutyRequest setTypeWorkerList(java.util.List<DeleteScheduleDutyRequestTypeWorkerList> typeWorkerList) {
        this.typeWorkerList = typeWorkerList;
        return this;
    }
    public java.util.List<DeleteScheduleDutyRequestTypeWorkerList> getTypeWorkerList() {
        return this.typeWorkerList;
    }

    public static class DeleteScheduleDutyRequestTypeWorkerList extends TeaModel {
        @NameInMap("ScheduleTypeId")
        public String scheduleTypeId;

        @NameInMap("ScheduleTypeName")
        public String scheduleTypeName;

        @NameInMap("ScheduleWorkerName")
        public String scheduleWorkerName;

        public static DeleteScheduleDutyRequestTypeWorkerList build(java.util.Map<String, ?> map) throws Exception {
            DeleteScheduleDutyRequestTypeWorkerList self = new DeleteScheduleDutyRequestTypeWorkerList();
            return TeaModel.build(map, self);
        }

        public DeleteScheduleDutyRequestTypeWorkerList setScheduleTypeId(String scheduleTypeId) {
            this.scheduleTypeId = scheduleTypeId;
            return this;
        }
        public String getScheduleTypeId() {
            return this.scheduleTypeId;
        }

        public DeleteScheduleDutyRequestTypeWorkerList setScheduleTypeName(String scheduleTypeName) {
            this.scheduleTypeName = scheduleTypeName;
            return this;
        }
        public String getScheduleTypeName() {
            return this.scheduleTypeName;
        }

        public DeleteScheduleDutyRequestTypeWorkerList setScheduleWorkerName(String scheduleWorkerName) {
            this.scheduleWorkerName = scheduleWorkerName;
            return this;
        }
        public String getScheduleWorkerName() {
            return this.scheduleWorkerName;
        }

    }

}
