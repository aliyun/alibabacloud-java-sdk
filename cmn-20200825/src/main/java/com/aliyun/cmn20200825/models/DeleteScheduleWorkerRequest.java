// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteScheduleWorkerRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("ScheduleWorkerId")
    public String scheduleWorkerId;

    public static DeleteScheduleWorkerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduleWorkerRequest self = new DeleteScheduleWorkerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScheduleWorkerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteScheduleWorkerRequest setScheduleWorkerId(String scheduleWorkerId) {
        this.scheduleWorkerId = scheduleWorkerId;
        return this;
    }
    public String getScheduleWorkerId() {
        return this.scheduleWorkerId;
    }

}
