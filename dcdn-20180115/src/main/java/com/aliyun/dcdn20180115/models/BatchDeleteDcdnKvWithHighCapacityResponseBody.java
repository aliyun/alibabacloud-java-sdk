// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchDeleteDcdnKvWithHighCapacityResponseBody extends TeaModel {
    @NameInMap("FailKeys")
    public java.util.List<String> failKeys;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessKeys")
    public java.util.List<String> successKeys;

    public static BatchDeleteDcdnKvWithHighCapacityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDcdnKvWithHighCapacityResponseBody self = new BatchDeleteDcdnKvWithHighCapacityResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDcdnKvWithHighCapacityResponseBody setFailKeys(java.util.List<String> failKeys) {
        this.failKeys = failKeys;
        return this;
    }
    public java.util.List<String> getFailKeys() {
        return this.failKeys;
    }

    public BatchDeleteDcdnKvWithHighCapacityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteDcdnKvWithHighCapacityResponseBody setSuccessKeys(java.util.List<String> successKeys) {
        this.successKeys = successKeys;
        return this;
    }
    public java.util.List<String> getSuccessKeys() {
        return this.successKeys;
    }

}
