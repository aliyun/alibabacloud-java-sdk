// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetAsyncResultRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static GetAsyncResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncResultRequest self = new GetAsyncResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
