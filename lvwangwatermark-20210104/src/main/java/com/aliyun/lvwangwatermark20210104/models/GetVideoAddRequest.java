// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetVideoAddRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static GetVideoAddRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoAddRequest self = new GetVideoAddRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoAddRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
