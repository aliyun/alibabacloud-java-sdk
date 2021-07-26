// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateScheduleTypeResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 资源实例ID，如ECS实例的创建接口CreateInstance应返回InstanceId。
    @NameInMap("ScheduleTypeId")
    public String scheduleTypeId;

    public static CreateScheduleTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleTypeResponseBody self = new CreateScheduleTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScheduleTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScheduleTypeResponseBody setScheduleTypeId(String scheduleTypeId) {
        this.scheduleTypeId = scheduleTypeId;
        return this;
    }
    public String getScheduleTypeId() {
        return this.scheduleTypeId;
    }

}
