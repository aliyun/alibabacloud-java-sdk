// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListTaskItemsRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static ListTaskItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskItemsRequest self = new ListTaskItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskItemsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
