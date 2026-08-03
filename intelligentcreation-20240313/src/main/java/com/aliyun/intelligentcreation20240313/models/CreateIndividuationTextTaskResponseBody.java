// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateIndividuationTextTaskResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("taskId")
    public String taskId;

    public static CreateIndividuationTextTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIndividuationTextTaskResponseBody self = new CreateIndividuationTextTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIndividuationTextTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIndividuationTextTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
