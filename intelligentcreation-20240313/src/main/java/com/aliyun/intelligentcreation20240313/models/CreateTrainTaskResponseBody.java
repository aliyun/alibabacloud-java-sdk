// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateTrainTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>84657DE0-B68C-508B-AFE7-8ED921854E3C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>837091359375048704</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static CreateTrainTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainTaskResponseBody self = new CreateTrainTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrainTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTrainTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
