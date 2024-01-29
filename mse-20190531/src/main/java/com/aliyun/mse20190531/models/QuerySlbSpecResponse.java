// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QuerySlbSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySlbSpecResponseBody body;

    public static QuerySlbSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySlbSpecResponse self = new QuerySlbSpecResponse();
        return TeaModel.build(map, self);
    }

    public QuerySlbSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySlbSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySlbSpecResponse setBody(QuerySlbSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySlbSpecResponseBody getBody() {
        return this.body;
    }

}
