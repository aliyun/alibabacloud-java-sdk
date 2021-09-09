// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CancelTaskRequest extends TeaModel {
    @NameInMap("taskType")
    public String taskType;

    @NameInMap("clientToken")
    public String clientToken;

    public static CancelTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelTaskRequest self = new CancelTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CancelTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
