// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C560A803-B975-481D-A66B-A4395EA863A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3cb1adc3-20e8-44ae-9e76-e812fa6fc9d8</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody self = new SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
