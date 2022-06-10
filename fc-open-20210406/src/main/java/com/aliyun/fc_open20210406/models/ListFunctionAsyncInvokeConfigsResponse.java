// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListFunctionAsyncInvokeConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFunctionAsyncInvokeConfigsResponseBody body;

    public static ListFunctionAsyncInvokeConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionAsyncInvokeConfigsResponse self = new ListFunctionAsyncInvokeConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListFunctionAsyncInvokeConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFunctionAsyncInvokeConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFunctionAsyncInvokeConfigsResponse setBody(ListFunctionAsyncInvokeConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFunctionAsyncInvokeConfigsResponseBody getBody() {
        return this.body;
    }

}
