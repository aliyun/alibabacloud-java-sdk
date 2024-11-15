// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class QueryCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCallbackResponseBody body;

    public static QueryCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCallbackResponse self = new QueryCallbackResponse();
        return TeaModel.build(map, self);
    }

    public QueryCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCallbackResponse setBody(QueryCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCallbackResponseBody getBody() {
        return this.body;
    }

}
