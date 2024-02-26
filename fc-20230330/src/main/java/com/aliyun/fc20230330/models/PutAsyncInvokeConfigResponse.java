// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutAsyncInvokeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AsyncConfig body;

    public static PutAsyncInvokeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PutAsyncInvokeConfigResponse self = new PutAsyncInvokeConfigResponse();
        return TeaModel.build(map, self);
    }

    public PutAsyncInvokeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutAsyncInvokeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutAsyncInvokeConfigResponse setBody(AsyncConfig body) {
        this.body = body;
        return this;
    }
    public AsyncConfig getBody() {
        return this.body;
    }

}
