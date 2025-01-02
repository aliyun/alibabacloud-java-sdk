// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ReimageNodesResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>15FBCD9B-C93F-54E8-A168-AADE7E66DAD2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Task ID</p>
     * 
     * <strong>example:</strong>
     * <p>i158782151663841517926</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ReimageNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReimageNodesResponseBody self = new ReimageNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ReimageNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReimageNodesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
