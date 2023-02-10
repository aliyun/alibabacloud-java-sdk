// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentautoml20221229.models;

import com.aliyun.tea.*;

public class PredictTemplateModelRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("TaskId")
    public Long taskId;

    public static PredictTemplateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        PredictTemplateModelRequest self = new PredictTemplateModelRequest();
        return TeaModel.build(map, self);
    }

    public PredictTemplateModelRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PredictTemplateModelRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
