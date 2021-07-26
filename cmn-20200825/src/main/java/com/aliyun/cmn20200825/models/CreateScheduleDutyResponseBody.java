// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateScheduleDutyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 资源实例ID，如ECS实例的创建接口CreateInstance应返回InstanceId。
    @NameInMap("ScheduleDutyId")
    public String scheduleDutyId;

    public static CreateScheduleDutyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleDutyResponseBody self = new CreateScheduleDutyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScheduleDutyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScheduleDutyResponseBody setScheduleDutyId(String scheduleDutyId) {
        this.scheduleDutyId = scheduleDutyId;
        return this;
    }
    public String getScheduleDutyId() {
        return this.scheduleDutyId;
    }

}
