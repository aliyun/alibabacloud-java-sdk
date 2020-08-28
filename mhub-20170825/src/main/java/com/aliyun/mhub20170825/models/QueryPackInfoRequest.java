// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryPackInfoRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static QueryPackInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPackInfoRequest self = new QueryPackInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryPackInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
