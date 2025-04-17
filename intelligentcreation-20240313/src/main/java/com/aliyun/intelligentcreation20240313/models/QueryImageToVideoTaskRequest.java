// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryImageToVideoTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>868125994191405056</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static QueryImageToVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryImageToVideoTaskRequest self = new QueryImageToVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryImageToVideoTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
