// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryConsumerGroupListResponse setBody(QueryConsumerGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConsumerGroupListResponseBody getBody() {
        return this.body;
    }

}
