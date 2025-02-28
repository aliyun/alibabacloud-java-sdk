// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InitDmsAIServiceK8sEnvResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static InitDmsAIServiceK8sEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitDmsAIServiceK8sEnvResponseBody self = new InitDmsAIServiceK8sEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public InitDmsAIServiceK8sEnvResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
