// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchPutKvWithHighCapacityResponseBody extends TeaModel {
    /**
     * <p>The keys that failed to be written.</p>
     */
    @NameInMap("FailKeys")
    public java.util.List<String> failKeys;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The keys that were written.</p>
     */
    @NameInMap("SuccessKeys")
    public java.util.List<String> successKeys;

    public static BatchPutKvWithHighCapacityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchPutKvWithHighCapacityResponseBody self = new BatchPutKvWithHighCapacityResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchPutKvWithHighCapacityResponseBody setFailKeys(java.util.List<String> failKeys) {
        this.failKeys = failKeys;
        return this;
    }
    public java.util.List<String> getFailKeys() {
        return this.failKeys;
    }

    public BatchPutKvWithHighCapacityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchPutKvWithHighCapacityResponseBody setSuccessKeys(java.util.List<String> successKeys) {
        this.successKeys = successKeys;
        return this;
    }
    public java.util.List<String> getSuccessKeys() {
        return this.successKeys;
    }

}
