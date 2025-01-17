// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTranslateImageBatchResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EEA28E6D-4828-5031-BD8C-8FF1B3216842</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetTranslateImageBatchResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTranslateImageBatchResultRequest self = new GetTranslateImageBatchResultRequest();
        return TeaModel.build(map, self);
    }

    public GetTranslateImageBatchResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
