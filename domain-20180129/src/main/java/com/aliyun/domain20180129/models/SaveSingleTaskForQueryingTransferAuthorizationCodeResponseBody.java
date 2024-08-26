// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AF7D4DCE-0776-47F2-A9B2-6FB85A87AA60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3cb1adc3-20e8-44ae-9e76-e812fa6fc9d8</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody self = new SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
