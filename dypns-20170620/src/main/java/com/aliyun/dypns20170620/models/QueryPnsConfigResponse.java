// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryPnsConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPnsConfigResponseBody body;

    public static QueryPnsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPnsConfigResponse self = new QueryPnsConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryPnsConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPnsConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPnsConfigResponse setBody(QueryPnsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPnsConfigResponseBody getBody() {
        return this.body;
    }

}
