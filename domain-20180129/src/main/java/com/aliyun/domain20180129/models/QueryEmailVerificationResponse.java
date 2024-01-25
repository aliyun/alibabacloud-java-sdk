// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryEmailVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEmailVerificationResponseBody body;

    public static QueryEmailVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEmailVerificationResponse self = new QueryEmailVerificationResponse();
        return TeaModel.build(map, self);
    }

    public QueryEmailVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEmailVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEmailVerificationResponse setBody(QueryEmailVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEmailVerificationResponseBody getBody() {
        return this.body;
    }

}
