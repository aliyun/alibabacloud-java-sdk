// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ScheduleWorker extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ScheduleWorkerId")
    public String scheduleWorkerId;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("WorkerContact")
    public String workerContact;

    @NameInMap("WorkerId")
    public String workerId;

    @NameInMap("WorkerName")
    public String workerName;

    public static ScheduleWorker build(java.util.Map<String, ?> map) throws Exception {
        ScheduleWorker self = new ScheduleWorker();
        return TeaModel.build(map, self);
    }

    public ScheduleWorker setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ScheduleWorker setScheduleWorkerId(String scheduleWorkerId) {
        this.scheduleWorkerId = scheduleWorkerId;
        return this;
    }
    public String getScheduleWorkerId() {
        return this.scheduleWorkerId;
    }

    public ScheduleWorker setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public ScheduleWorker setWorkerContact(String workerContact) {
        this.workerContact = workerContact;
        return this;
    }
    public String getWorkerContact() {
        return this.workerContact;
    }

    public ScheduleWorker setWorkerId(String workerId) {
        this.workerId = workerId;
        return this;
    }
    public String getWorkerId() {
        return this.workerId;
    }

    public ScheduleWorker setWorkerName(String workerName) {
        this.workerName = workerName;
        return this;
    }
    public String getWorkerName() {
        return this.workerName;
    }

}
