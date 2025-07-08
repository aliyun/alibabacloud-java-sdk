// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class BatchDeleteTaskNewResponseBody extends TeaModel {
    @NameInMap("FailList")
    public java.util.List<String> failList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessList")
    public java.util.List<String> successList;

    public static BatchDeleteTaskNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteTaskNewResponseBody self = new BatchDeleteTaskNewResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteTaskNewResponseBody setFailList(java.util.List<String> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<String> getFailList() {
        return this.failList;
    }

    public BatchDeleteTaskNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteTaskNewResponseBody setSuccessList(java.util.List<String> successList) {
        this.successList = successList;
        return this;
    }
    public java.util.List<String> getSuccessList() {
        return this.successList;
    }

}
