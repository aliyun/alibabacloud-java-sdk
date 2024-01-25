// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryContactInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
