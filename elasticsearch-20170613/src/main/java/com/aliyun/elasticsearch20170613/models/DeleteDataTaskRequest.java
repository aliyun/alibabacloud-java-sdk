// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteDataTaskRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("taskId")
    public String taskId;

    public static DeleteDataTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataTaskRequest self = new DeleteDataTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteDataTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
