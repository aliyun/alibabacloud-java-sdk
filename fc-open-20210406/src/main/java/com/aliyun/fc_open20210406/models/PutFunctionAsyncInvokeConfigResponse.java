// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionAsyncInvokeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutFunctionAsyncInvokeConfigResponseBody body;

    public static PutFunctionAsyncInvokeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PutFunctionAsyncInvokeConfigResponse self = new PutFunctionAsyncInvokeConfigResponse();
        return TeaModel.build(map, self);
    }

    public PutFunctionAsyncInvokeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutFunctionAsyncInvokeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutFunctionAsyncInvokeConfigResponse setBody(PutFunctionAsyncInvokeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public PutFunctionAsyncInvokeConfigResponseBody getBody() {
        return this.body;
    }

}
