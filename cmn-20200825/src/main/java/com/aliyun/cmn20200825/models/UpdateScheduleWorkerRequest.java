// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateScheduleWorkerRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源一级ID
    @NameInMap("ScheduleWorkerId")
    public String scheduleWorkerId;

    // 值班人员工号
    @NameInMap("WorkerId")
    public String workerId;

    // 值班人员姓名
    @NameInMap("WorkerName")
    public String workerName;

    // 联系方式
    @NameInMap("WorkerContact")
    public String workerContact;

    public static UpdateScheduleWorkerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleWorkerRequest self = new UpdateScheduleWorkerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleWorkerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateScheduleWorkerRequest setScheduleWorkerId(String scheduleWorkerId) {
        this.scheduleWorkerId = scheduleWorkerId;
        return this;
    }
    public String getScheduleWorkerId() {
        return this.scheduleWorkerId;
    }

    public UpdateScheduleWorkerRequest setWorkerId(String workerId) {
        this.workerId = workerId;
        return this;
    }
    public String getWorkerId() {
        return this.workerId;
    }

    public UpdateScheduleWorkerRequest setWorkerName(String workerName) {
        this.workerName = workerName;
        return this;
    }
    public String getWorkerName() {
        return this.workerName;
    }

    public UpdateScheduleWorkerRequest setWorkerContact(String workerContact) {
        this.workerContact = workerContact;
        return this;
    }
    public String getWorkerContact() {
        return this.workerContact;
    }

}
