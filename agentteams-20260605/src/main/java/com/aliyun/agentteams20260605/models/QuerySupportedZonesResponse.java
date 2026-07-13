// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class QuerySupportedZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySupportedZonesResponseBody body;

    public static QuerySupportedZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySupportedZonesResponse self = new QuerySupportedZonesResponse();
        return TeaModel.build(map, self);
    }

    public QuerySupportedZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySupportedZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySupportedZonesResponse setBody(QuerySupportedZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySupportedZonesResponseBody getBody() {
        return this.body;
    }

}
