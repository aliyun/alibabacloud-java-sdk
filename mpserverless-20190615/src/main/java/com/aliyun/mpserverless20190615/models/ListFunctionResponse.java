// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFunctionResponseBody body;

    public static ListFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionResponse self = new ListFunctionResponse();
        return TeaModel.build(map, self);
    }

    public ListFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFunctionResponse setBody(ListFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFunctionResponseBody getBody() {
        return this.body;
    }

}
