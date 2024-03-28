// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryBagRemainingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBagRemainingResponseBody body;

    public static QueryBagRemainingResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBagRemainingResponse self = new QueryBagRemainingResponse();
        return TeaModel.build(map, self);
    }

    public QueryBagRemainingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBagRemainingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBagRemainingResponse setBody(QueryBagRemainingResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBagRemainingResponseBody getBody() {
        return this.body;
    }

}
