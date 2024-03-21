// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchPutDcdnKvResponseBody extends TeaModel {
    /**
     * <p>The keys that failed to be written.</p>
     */
    @NameInMap("FailKeys")
    public java.util.List<String> failKeys;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The keys that were written.</p>
     */
    @NameInMap("SuccessKeys")
    public java.util.List<String> successKeys;

    public static BatchPutDcdnKvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchPutDcdnKvResponseBody self = new BatchPutDcdnKvResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchPutDcdnKvResponseBody setFailKeys(java.util.List<String> failKeys) {
        this.failKeys = failKeys;
        return this;
    }
    public java.util.List<String> getFailKeys() {
        return this.failKeys;
    }

    public BatchPutDcdnKvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchPutDcdnKvResponseBody setSuccessKeys(java.util.List<String> successKeys) {
        this.successKeys = successKeys;
        return this;
    }
    public java.util.List<String> getSuccessKeys() {
        return this.successKeys;
    }

}
