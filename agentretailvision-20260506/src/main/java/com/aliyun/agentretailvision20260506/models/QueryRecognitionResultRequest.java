// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class QueryRecognitionResultRequest extends TeaModel {
    /**
     * <p>Business idempotent request ID</p>
     * 
     * <strong>example:</strong>
     * <p>ORDER_001</p>
     */
    @NameInMap("OrderUniqueId")
    public String orderUniqueId;

    /**
     * <p>Platform Task ID</p>
     * 
     * <strong>example:</strong>
     * <p>TASK_001</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static QueryRecognitionResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecognitionResultRequest self = new QueryRecognitionResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecognitionResultRequest setOrderUniqueId(String orderUniqueId) {
        this.orderUniqueId = orderUniqueId;
        return this;
    }
    public String getOrderUniqueId() {
        return this.orderUniqueId;
    }

    public QueryRecognitionResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
