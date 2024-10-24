// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QuerySessionInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySessionInfoResponseBody body;

    public static QuerySessionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionInfoResponse self = new QuerySessionInfoResponse();
        return TeaModel.build(map, self);
    }

    public QuerySessionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySessionInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySessionInfoResponse setBody(QuerySessionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySessionInfoResponseBody getBody() {
        return this.body;
    }

}
