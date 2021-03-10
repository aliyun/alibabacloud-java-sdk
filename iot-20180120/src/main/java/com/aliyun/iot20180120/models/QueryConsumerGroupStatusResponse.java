// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryConsumerGroupStatusResponse setBody(QueryConsumerGroupStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConsumerGroupStatusResponseBody getBody() {
        return this.body;
    }

}
