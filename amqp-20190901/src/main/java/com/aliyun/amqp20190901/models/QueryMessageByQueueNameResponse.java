// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class QueryMessageByQueueNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMessageByQueueNameResponseBody body;

    public static QueryMessageByQueueNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageByQueueNameResponse self = new QueryMessageByQueueNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryMessageByQueueNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMessageByQueueNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMessageByQueueNameResponse setBody(QueryMessageByQueueNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMessageByQueueNameResponseBody getBody() {
        return this.body;
    }

}
