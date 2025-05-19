// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QuerySystemEventDemoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySystemEventDemoResponseBody body;

    public static QuerySystemEventDemoResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemEventDemoResponse self = new QuerySystemEventDemoResponse();
        return TeaModel.build(map, self);
    }

    public QuerySystemEventDemoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySystemEventDemoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySystemEventDemoResponse setBody(QuerySystemEventDemoResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySystemEventDemoResponseBody getBody() {
        return this.body;
    }

}
