// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryMessageCallbackInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMessageCallbackInfoResponseBody body;

    public static QueryMessageCallbackInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageCallbackInfoResponse self = new QueryMessageCallbackInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMessageCallbackInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMessageCallbackInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMessageCallbackInfoResponse setBody(QueryMessageCallbackInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMessageCallbackInfoResponseBody getBody() {
        return this.body;
    }

}
