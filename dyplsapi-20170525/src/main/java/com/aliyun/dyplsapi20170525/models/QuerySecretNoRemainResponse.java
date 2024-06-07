// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretNoRemainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySecretNoRemainResponseBody body;

    public static QuerySecretNoRemainResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretNoRemainResponse self = new QuerySecretNoRemainResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecretNoRemainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySecretNoRemainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySecretNoRemainResponse setBody(QuerySecretNoRemainResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySecretNoRemainResponseBody getBody() {
        return this.body;
    }

}
