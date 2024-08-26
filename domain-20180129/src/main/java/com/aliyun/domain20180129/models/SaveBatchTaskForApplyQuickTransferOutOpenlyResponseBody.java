// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D6CB3623-4726-4947-AC2B-2C6E673B447C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>d3babb0a-c939-4c25-8c65-c47b65f5492a</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody self = new SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveBatchTaskForApplyQuickTransferOutOpenlyResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
