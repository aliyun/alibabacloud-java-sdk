// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryConsumerGroupStatusResponseBody body;

    public static QueryConsumerGroupStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupStatusResponse self = new QueryConsumerGroupStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumerGroupStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryConsumerGroupStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryConsumerGroupStatusResponse setBody(QueryConsumerGroupStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConsumerGroupStatusResponseBody getBody() {
        return this.body;
    }

}
