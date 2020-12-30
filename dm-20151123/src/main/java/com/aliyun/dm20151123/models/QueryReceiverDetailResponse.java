// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryReceiverDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryReceiverDetailResponseBody body;

    public static QueryReceiverDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReceiverDetailResponse self = new QueryReceiverDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryReceiverDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryReceiverDetailResponse setBody(QueryReceiverDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryReceiverDetailResponseBody getBody() {
        return this.body;
    }

}
