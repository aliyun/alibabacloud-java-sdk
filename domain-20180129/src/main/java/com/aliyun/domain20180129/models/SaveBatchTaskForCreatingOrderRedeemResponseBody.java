// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderRedeemResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F51977F9-2B40-462B-BCCD-CF5BB1E9DB56</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>d3babb0a-c939-4c25-8c65-c47b65f5492a</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveBatchTaskForCreatingOrderRedeemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForCreatingOrderRedeemResponseBody self = new SaveBatchTaskForCreatingOrderRedeemResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForCreatingOrderRedeemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveBatchTaskForCreatingOrderRedeemResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
