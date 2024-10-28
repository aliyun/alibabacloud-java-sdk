// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetTaskInstanceLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>This is running log</p>
     */
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
