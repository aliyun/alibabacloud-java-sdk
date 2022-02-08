// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class QueryRealTimeProcessStatusRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static QueryRealTimeProcessStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRealTimeProcessStatusRequest self = new QueryRealTimeProcessStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryRealTimeProcessStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
