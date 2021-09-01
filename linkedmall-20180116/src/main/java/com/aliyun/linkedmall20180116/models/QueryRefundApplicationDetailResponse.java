// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryRefundApplicationDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRefundApplicationDetailResponseBody body;

    public static QueryRefundApplicationDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRefundApplicationDetailResponse self = new QueryRefundApplicationDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryRefundApplicationDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRefundApplicationDetailResponse setBody(QueryRefundApplicationDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRefundApplicationDetailResponseBody getBody() {
        return this.body;
    }

}
