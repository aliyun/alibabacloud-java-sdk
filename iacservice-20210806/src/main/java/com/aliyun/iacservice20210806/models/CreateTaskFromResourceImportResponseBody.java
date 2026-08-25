// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateTaskFromResourceImportResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("taskId")
    public String taskId;

    public static CreateTaskFromResourceImportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskFromResourceImportResponseBody self = new CreateTaskFromResourceImportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTaskFromResourceImportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTaskFromResourceImportResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
