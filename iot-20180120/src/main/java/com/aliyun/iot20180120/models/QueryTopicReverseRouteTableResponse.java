// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTopicReverseRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTopicReverseRouteTableResponseBody body;

    public static QueryTopicReverseRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopicReverseRouteTableResponse self = new QueryTopicReverseRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopicReverseRouteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopicReverseRouteTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopicReverseRouteTableResponse setBody(QueryTopicReverseRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopicReverseRouteTableResponseBody getBody() {
        return this.body;
    }

}
