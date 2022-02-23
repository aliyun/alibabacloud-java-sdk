// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class QueryUnpaidOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUnpaidOrderResponseBody body;

    public static QueryUnpaidOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnpaidOrderResponse self = new QueryUnpaidOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnpaidOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUnpaidOrderResponse setBody(QueryUnpaidOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUnpaidOrderResponseBody getBody() {
        return this.body;
    }

}
