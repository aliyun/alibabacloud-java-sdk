// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryMessageQueueNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMessageQueueNewResponseBody body;

    public static QueryMessageQueueNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageQueueNewResponse self = new QueryMessageQueueNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryMessageQueueNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMessageQueueNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMessageQueueNewResponse setBody(QueryMessageQueueNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMessageQueueNewResponseBody getBody() {
        return this.body;
    }

}
