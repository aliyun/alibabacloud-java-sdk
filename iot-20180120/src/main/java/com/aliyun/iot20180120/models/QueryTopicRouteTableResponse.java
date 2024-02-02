// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTopicRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTopicRouteTableResponseBody body;

    public static QueryTopicRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopicRouteTableResponse self = new QueryTopicRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopicRouteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopicRouteTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopicRouteTableResponse setBody(QueryTopicRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopicRouteTableResponseBody getBody() {
        return this.body;
    }

}
