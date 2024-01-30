// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCancelingTransferOutResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveSingleTaskForCancelingTransferOutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCancelingTransferOutResponseBody self = new SaveSingleTaskForCancelingTransferOutResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCancelingTransferOutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveSingleTaskForCancelingTransferOutResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
