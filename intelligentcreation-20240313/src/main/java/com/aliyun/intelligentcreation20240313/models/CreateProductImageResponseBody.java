// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateProductImageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>837091359375048704</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static CreateProductImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProductImageResponseBody self = new CreateProductImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProductImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProductImageResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
