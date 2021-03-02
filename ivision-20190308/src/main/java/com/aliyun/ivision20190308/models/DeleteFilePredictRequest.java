// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class DeleteFilePredictRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static DeleteFilePredictRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilePredictRequest self = new DeleteFilePredictRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFilePredictRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
