// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInstanceResponseBody body;

    public static QueryInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceResponse self = new QueryInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInstanceResponse setBody(QueryInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInstanceResponseBody getBody() {
        return this.body;
    }

}
