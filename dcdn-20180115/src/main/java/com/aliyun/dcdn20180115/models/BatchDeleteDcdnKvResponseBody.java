// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchDeleteDcdnKvResponseBody extends TeaModel {
    @NameInMap("FailKeys")
    public java.util.List<String> failKeys;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessKeys")
    public java.util.List<String> successKeys;

    public static BatchDeleteDcdnKvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDcdnKvResponseBody self = new BatchDeleteDcdnKvResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDcdnKvResponseBody setFailKeys(java.util.List<String> failKeys) {
        this.failKeys = failKeys;
        return this;
    }
    public java.util.List<String> getFailKeys() {
        return this.failKeys;
    }

    public BatchDeleteDcdnKvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteDcdnKvResponseBody setSuccessKeys(java.util.List<String> successKeys) {
        this.successKeys = successKeys;
        return this;
    }
    public java.util.List<String> getSuccessKeys() {
        return this.successKeys;
    }

}
