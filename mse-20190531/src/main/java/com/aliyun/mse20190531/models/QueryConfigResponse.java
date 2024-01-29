// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryConfigResponseBody body;

    public static QueryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigResponse self = new QueryConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryConfigResponse setBody(QueryConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConfigResponseBody getBody() {
        return this.body;
    }

}
