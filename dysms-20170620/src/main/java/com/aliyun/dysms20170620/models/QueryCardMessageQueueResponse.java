// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardMessageQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCardMessageQueueResponseBody body;

    public static QueryCardMessageQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCardMessageQueueResponse self = new QueryCardMessageQueueResponse();
        return TeaModel.build(map, self);
    }

    public QueryCardMessageQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCardMessageQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCardMessageQueueResponse setBody(QueryCardMessageQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCardMessageQueueResponseBody getBody() {
        return this.body;
    }

}
