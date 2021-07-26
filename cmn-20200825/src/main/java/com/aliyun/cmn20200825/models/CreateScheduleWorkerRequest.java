// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateScheduleWorkerRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 值班人员工号
    @NameInMap("WorkerId")
    public String workerId;

    // 值班人员姓名
    @NameInMap("WorkerName")
    public String workerName;

    // 联系方式
    @NameInMap("WorkerContact")
    public String workerContact;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateScheduleWorkerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleWorkerRequest self = new CreateScheduleWorkerRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduleWorkerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScheduleWorkerRequest setWorkerId(String workerId) {
        this.workerId = workerId;
        return this;
    }
    public String getWorkerId() {
        return this.workerId;
    }

    public CreateScheduleWorkerRequest setWorkerName(String workerName) {
        this.workerName = workerName;
        return this;
    }
    public String getWorkerName() {
        return this.workerName;
    }

    public CreateScheduleWorkerRequest setWorkerContact(String workerContact) {
        this.workerContact = workerContact;
        return this;
    }
    public String getWorkerContact() {
        return this.workerContact;
    }

    public CreateScheduleWorkerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
