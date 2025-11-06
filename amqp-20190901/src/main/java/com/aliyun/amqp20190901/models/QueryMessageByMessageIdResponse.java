// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class QueryMessageByMessageIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMessageByMessageIdResponseBody body;

    public static QueryMessageByMessageIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageByMessageIdResponse self = new QueryMessageByMessageIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryMessageByMessageIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMessageByMessageIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMessageByMessageIdResponse setBody(QueryMessageByMessageIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMessageByMessageIdResponseBody getBody() {
        return this.body;
    }

}
