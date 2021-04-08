// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetVideoExtractRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static GetVideoExtractRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoExtractRequest self = new GetVideoExtractRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoExtractRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
