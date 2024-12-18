// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ExtendClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>03668372-18FF-5959-98D9-6B36A4643C7A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>i158475611663639202234</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ExtendClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExtendClusterResponseBody self = new ExtendClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ExtendClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExtendClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
