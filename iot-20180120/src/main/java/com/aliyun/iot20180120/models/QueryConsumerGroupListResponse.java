// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryConsumerGroupListResponseBody body;

    public static QueryConsumerGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupListResponse self = new QueryConsumerGroupListResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumerGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryConsumerGroupListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryConsumerGroupListResponse setBody(QueryConsumerGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConsumerGroupListResponseBody getBody() {
        return this.body;
    }

}
