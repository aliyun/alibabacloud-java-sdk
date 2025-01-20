// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchCreateAICoachTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>10923AA3-F7A1-5EA0-ACCA-D704269EAA78</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("taskIds")
    public java.util.List<String> taskIds;

    public static BatchCreateAICoachTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateAICoachTaskResponseBody self = new BatchCreateAICoachTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateAICoachTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateAICoachTaskResponseBody setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
