// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ScheduleDuty extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("ScheduleDutyId")
    public String scheduleDutyId;

    @NameInMap("ScheduleTypeIds")
    public java.util.List<String> scheduleTypeIds;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("TypeWorkerList")
    public java.util.List<ScheduleDutyTypeWorkerList> typeWorkerList;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("WorkDate")
    public String workDate;

    @NameInMap("WorkType")
    public String workType;

    @NameInMap("WorkerId")
    public String workerId;

    @NameInMap("WorkerName")
    public String workerName;

    public static ScheduleDuty build(java.util.Map<String, ?> map) throws Exception {
        ScheduleDuty self = new ScheduleDuty();
        return TeaModel.build(map, self);
    }

    public ScheduleDuty setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ScheduleDuty setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ScheduleDuty setScheduleDutyId(String scheduleDutyId) {
        this.scheduleDutyId = scheduleDutyId;
        return this;
    }
    public String getScheduleDutyId() {
        return this.scheduleDutyId;
    }

    public ScheduleDuty setScheduleTypeIds(java.util.List<String> scheduleTypeIds) {
        this.scheduleTypeIds = scheduleTypeIds;
        return this;
    }
    public java.util.List<String> getScheduleTypeIds() {
        return this.scheduleTypeIds;
    }

    public ScheduleDuty setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ScheduleDuty setTypeWorkerList(java.util.List<ScheduleDutyTypeWorkerList> typeWorkerList) {
        this.typeWorkerList = typeWorkerList;
        return this;
    }
    public java.util.List<ScheduleDutyTypeWorkerList> getTypeWorkerList() {
        return this.typeWorkerList;
    }

    public ScheduleDuty setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public ScheduleDuty setWorkDate(String workDate) {
        this.workDate = workDate;
        return this;
    }
    public String getWorkDate() {
        return this.workDate;
    }

    public ScheduleDuty setWorkType(String workType) {
        this.workType = workType;
        return this;
    }
    public String getWorkType() {
        return this.workType;
    }

    public ScheduleDuty setWorkerId(String workerId) {
        this.workerId = workerId;
        return this;
    }
    public String getWorkerId() {
        return this.workerId;
    }

    public ScheduleDuty setWorkerName(String workerName) {
        this.workerName = workerName;
        return this;
    }
    public String getWorkerName() {
        return this.workerName;
    }

    public static class ScheduleDutyTypeWorkerList extends TeaModel {
        @NameInMap("ScheduleTypeId")
        public String scheduleTypeId;

        @NameInMap("ScheduleWorkerName")
        public java.util.List<String> scheduleWorkerName;

        public static ScheduleDutyTypeWorkerList build(java.util.Map<String, ?> map) throws Exception {
            ScheduleDutyTypeWorkerList self = new ScheduleDutyTypeWorkerList();
            return TeaModel.build(map, self);
        }

        public ScheduleDutyTypeWorkerList setScheduleTypeId(String scheduleTypeId) {
            this.scheduleTypeId = scheduleTypeId;
            return this;
        }
        public String getScheduleTypeId() {
            return this.scheduleTypeId;
        }

        public ScheduleDutyTypeWorkerList setScheduleWorkerName(java.util.List<String> scheduleWorkerName) {
            this.scheduleWorkerName = scheduleWorkerName;
            return this;
        }
        public java.util.List<String> getScheduleWorkerName() {
            return this.scheduleWorkerName;
        }

    }

}
