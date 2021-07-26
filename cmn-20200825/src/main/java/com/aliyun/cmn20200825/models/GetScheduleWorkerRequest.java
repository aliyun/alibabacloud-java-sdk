// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetScheduleWorkerRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("ScheduleWorkerId")
    public String scheduleWorkerId;

    public static GetScheduleWorkerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleWorkerRequest self = new GetScheduleWorkerRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduleWorkerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetScheduleWorkerRequest setScheduleWorkerId(String scheduleWorkerId) {
        this.scheduleWorkerId = scheduleWorkerId;
        return this;
    }
    public String getScheduleWorkerId() {
        return this.scheduleWorkerId;
    }

}
