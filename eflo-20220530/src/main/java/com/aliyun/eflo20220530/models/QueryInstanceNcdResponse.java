// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class QueryInstanceNcdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInstanceNcdResponseBody body;

    public static QueryInstanceNcdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceNcdResponse self = new QueryInstanceNcdResponse();
        return TeaModel.build(map, self);
    }

    public QueryInstanceNcdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInstanceNcdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInstanceNcdResponse setBody(QueryInstanceNcdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInstanceNcdResponseBody getBody() {
        return this.body;
    }

}
