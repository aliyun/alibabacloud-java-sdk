// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryCopyrightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCopyrightResponseBody body;

    public static QueryCopyrightResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightResponse self = new QueryCopyrightResponse();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCopyrightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCopyrightResponse setBody(QueryCopyrightResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCopyrightResponseBody getBody() {
        return this.body;
    }

}
