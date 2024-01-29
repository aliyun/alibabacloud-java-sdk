// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QuerySearchLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySearchLibResponseBody body;

    public static QuerySearchLibResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySearchLibResponse self = new QuerySearchLibResponse();
        return TeaModel.build(map, self);
    }

    public QuerySearchLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySearchLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySearchLibResponse setBody(QuerySearchLibResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySearchLibResponseBody getBody() {
        return this.body;
    }

}
