// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupByGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryConsumerGroupByGroupIdResponseBody body;

    public static QueryConsumerGroupByGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupByGroupIdResponse self = new QueryConsumerGroupByGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumerGroupByGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryConsumerGroupByGroupIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryConsumerGroupByGroupIdResponse setBody(QueryConsumerGroupByGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConsumerGroupByGroupIdResponseBody getBody() {
        return this.body;
    }

}
