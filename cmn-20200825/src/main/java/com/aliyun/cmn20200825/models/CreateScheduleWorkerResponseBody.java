// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateScheduleWorkerResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 资源实例ID，如ECS实例的创建接口CreateInstance应返回InstanceId。
    @NameInMap("ScheduleWorkerId")
    public String scheduleWorkerId;

    public static CreateScheduleWorkerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleWorkerResponseBody self = new CreateScheduleWorkerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScheduleWorkerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScheduleWorkerResponseBody setScheduleWorkerId(String scheduleWorkerId) {
        this.scheduleWorkerId = scheduleWorkerId;
        return this;
    }
    public String getScheduleWorkerId() {
        return this.scheduleWorkerId;
    }

}
