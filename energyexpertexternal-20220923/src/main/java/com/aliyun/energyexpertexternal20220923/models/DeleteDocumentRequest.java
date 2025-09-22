// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class DeleteDocumentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>74ec62f4f4e74e5882d4086a40f2b9c6</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static DeleteDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocumentRequest self = new DeleteDocumentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDocumentRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
