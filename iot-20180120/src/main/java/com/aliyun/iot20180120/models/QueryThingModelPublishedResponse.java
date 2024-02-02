// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelPublishedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryThingModelPublishedResponseBody body;

    public static QueryThingModelPublishedResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelPublishedResponse self = new QueryThingModelPublishedResponse();
        return TeaModel.build(map, self);
    }

    public QueryThingModelPublishedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryThingModelPublishedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryThingModelPublishedResponse setBody(QueryThingModelPublishedResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryThingModelPublishedResponseBody getBody() {
        return this.body;
    }

}
