// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachScriptGenerateTaskRequest extends TeaModel {
    @NameInMap("taskId")
    public String taskId;

    public static GetAICoachScriptGenerateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachScriptGenerateTaskRequest self = new GetAICoachScriptGenerateTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetAICoachScriptGenerateTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
