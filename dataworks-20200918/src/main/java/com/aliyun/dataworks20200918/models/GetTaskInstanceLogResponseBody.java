// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetTaskInstanceLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskInstanceLog")
    public String taskInstanceLog;

    public static GetTaskInstanceLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskInstanceLogResponseBody self = new GetTaskInstanceLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskInstanceLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskInstanceLogResponseBody setTaskInstanceLog(String taskInstanceLog) {
        this.taskInstanceLog = taskInstanceLog;
        return this;
    }
    public String getTaskInstanceLog() {
        return this.taskInstanceLog;
    }

}
