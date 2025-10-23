// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class DetailDocumentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>74ec62f4f4e74e5882d4086a40f2b9c6</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static DetailDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailDocumentRequest self = new DetailDocumentRequest();
        return TeaModel.build(map, self);
    }

    public DetailDocumentRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
