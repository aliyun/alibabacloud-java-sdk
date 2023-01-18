// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartWorkflowRequest extends TeaModel {
    @NameInMap("TaskInput")
    public String taskInput;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("WorkflowId")
    public String workflowId;

    public static StartWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        StartWorkflowRequest self = new StartWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public StartWorkflowRequest setTaskInput(String taskInput) {
        this.taskInput = taskInput;
        return this;
    }
    public String getTaskInput() {
        return this.taskInput;
    }

    public StartWorkflowRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public StartWorkflowRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
