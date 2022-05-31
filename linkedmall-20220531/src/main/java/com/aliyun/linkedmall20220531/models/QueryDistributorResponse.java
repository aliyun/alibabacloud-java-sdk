// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDistributorResponseBody body;

    public static QueryDistributorResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributorResponse self = new QueryDistributorResponse();
        return TeaModel.build(map, self);
    }

    public QueryDistributorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDistributorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDistributorResponse setBody(QueryDistributorResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDistributorResponseBody getBody() {
        return this.body;
    }

}
