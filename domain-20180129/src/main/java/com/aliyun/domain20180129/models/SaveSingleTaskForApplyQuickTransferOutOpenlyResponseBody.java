// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForApplyQuickTransferOutOpenlyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D200000-C0B9-4CD3-B92A-9B44A000000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3cb1adc3-20e8-44ae-9e76-e812fa6fc9d8</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveSingleTaskForApplyQuickTransferOutOpenlyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForApplyQuickTransferOutOpenlyResponseBody self = new SaveSingleTaskForApplyQuickTransferOutOpenlyResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForApplyQuickTransferOutOpenlyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveSingleTaskForApplyQuickTransferOutOpenlyResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
