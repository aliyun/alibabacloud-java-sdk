// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryContactInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryContactInfoResponseBody body;

    public static QueryContactInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContactInfoResponse self = new QueryContactInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryContactInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryContactInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryContactInfoResponse setBody(QueryContactInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryContactInfoResponseBody getBody() {
        return this.body;
    }

}
