// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListAsyncInvokeConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAsyncInvokeConfigOutput body;

    public static ListAsyncInvokeConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncInvokeConfigsResponse self = new ListAsyncInvokeConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListAsyncInvokeConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAsyncInvokeConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAsyncInvokeConfigsResponse setBody(ListAsyncInvokeConfigOutput body) {
        this.body = body;
        return this;
    }
    public ListAsyncInvokeConfigOutput getBody() {
        return this.body;
    }

}
