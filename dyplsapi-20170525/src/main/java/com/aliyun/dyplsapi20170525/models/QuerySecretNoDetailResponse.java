// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretNoDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySecretNoDetailResponseBody body;

    public static QuerySecretNoDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretNoDetailResponse self = new QuerySecretNoDetailResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecretNoDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySecretNoDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySecretNoDetailResponse setBody(QuerySecretNoDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySecretNoDetailResponseBody getBody() {
        return this.body;
    }

}
