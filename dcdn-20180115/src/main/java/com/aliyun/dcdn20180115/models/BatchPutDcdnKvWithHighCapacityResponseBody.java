// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchPutDcdnKvWithHighCapacityResponseBody extends TeaModel {
    @NameInMap("FailKeys")
    public java.util.List<String> failKeys;

    /**
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessKeys")
    public java.util.List<String> successKeys;

    public static BatchPutDcdnKvWithHighCapacityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchPutDcdnKvWithHighCapacityResponseBody self = new BatchPutDcdnKvWithHighCapacityResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchPutDcdnKvWithHighCapacityResponseBody setFailKeys(java.util.List<String> failKeys) {
        this.failKeys = failKeys;
        return this;
    }
    public java.util.List<String> getFailKeys() {
        return this.failKeys;
    }

    public BatchPutDcdnKvWithHighCapacityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchPutDcdnKvWithHighCapacityResponseBody setSuccessKeys(java.util.List<String> successKeys) {
        this.successKeys = successKeys;
        return this;
    }
    public java.util.List<String> getSuccessKeys() {
        return this.successKeys;
    }

}
