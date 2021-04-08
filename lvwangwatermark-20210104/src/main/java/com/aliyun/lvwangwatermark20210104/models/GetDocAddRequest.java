// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetDocAddRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static GetDocAddRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocAddRequest self = new GetDocAddRequest();
        return TeaModel.build(map, self);
    }

    public GetDocAddRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
