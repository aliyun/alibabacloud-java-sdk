// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryIndividuationTextTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>829682927337963520</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static QueryIndividuationTextTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIndividuationTextTaskRequest self = new QueryIndividuationTextTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryIndividuationTextTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
