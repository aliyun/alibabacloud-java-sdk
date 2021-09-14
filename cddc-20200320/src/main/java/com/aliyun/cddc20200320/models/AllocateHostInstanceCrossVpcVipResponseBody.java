// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class AllocateHostInstanceCrossVpcVipResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    public static AllocateHostInstanceCrossVpcVipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateHostInstanceCrossVpcVipResponseBody self = new AllocateHostInstanceCrossVpcVipResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateHostInstanceCrossVpcVipResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AllocateHostInstanceCrossVpcVipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
