// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QuerySystemEventCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySystemEventCountResponseBody body;

    public static QuerySystemEventCountResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemEventCountResponse self = new QuerySystemEventCountResponse();
        return TeaModel.build(map, self);
    }

    public QuerySystemEventCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySystemEventCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySystemEventCountResponse setBody(QuerySystemEventCountResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySystemEventCountResponseBody getBody() {
        return this.body;
    }

}
