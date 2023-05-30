// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionAsyncInvokeConfigHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The name of the service.</p>
     */
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    /**
     * <p>The creation time.</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    /**
     * <p>The maximum number of retries allowed after an asynchronous invocation fails. Default value: 3. Valid values: 0 to 8.</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static PutFunctionAsyncInvokeConfigHeaders build(java.util.Map<String, ?> map) throws Exception {
        PutFunctionAsyncInvokeConfigHeaders self = new PutFunctionAsyncInvokeConfigHeaders();
        return TeaModel.build(map, self);
    }

    public PutFunctionAsyncInvokeConfigHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public PutFunctionAsyncInvokeConfigHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public PutFunctionAsyncInvokeConfigHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public PutFunctionAsyncInvokeConfigHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
