// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionAsyncInvokeConfigHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The ID of your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>188077086902****</p>
     */
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    /**
     * <p>The time when the function is invoked. The value is in the <strong>EEE,d MMM yyyy HH:mm:ss GMT</strong> format.</p>
     * 
     * <strong>example:</strong>
     * <p>The information about the asynchronous invocation configuration.</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    /**
     * <p>The trace ID of the request for the Function Compute API.</p>
     * 
     * <strong>example:</strong>
     * <p>ksdfjkdmkki***</p>
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
