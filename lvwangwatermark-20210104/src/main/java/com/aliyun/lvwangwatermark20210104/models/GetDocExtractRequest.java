// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetDocExtractRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static GetDocExtractRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocExtractRequest self = new GetDocExtractRequest();
        return TeaModel.build(map, self);
    }

    public GetDocExtractRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
