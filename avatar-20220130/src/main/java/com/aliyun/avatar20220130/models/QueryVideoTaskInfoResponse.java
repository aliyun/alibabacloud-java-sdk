// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class QueryVideoTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryVideoTaskInfoResponseBody body;

    public static QueryVideoTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoTaskInfoResponse self = new QueryVideoTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryVideoTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVideoTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryVideoTaskInfoResponse setBody(QueryVideoTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVideoTaskInfoResponseBody getBody() {
        return this.body;
    }

}
