// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryEmailVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryEmailVerificationResponse setBody(QueryEmailVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEmailVerificationResponseBody getBody() {
        return this.body;
    }

}
