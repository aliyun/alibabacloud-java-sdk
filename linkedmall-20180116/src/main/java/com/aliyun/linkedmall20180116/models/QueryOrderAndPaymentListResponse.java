// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderAndPaymentListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrderAndPaymentListResponseBody body;

    public static QueryOrderAndPaymentListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderAndPaymentListResponse self = new QueryOrderAndPaymentListResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderAndPaymentListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderAndPaymentListResponse setBody(QueryOrderAndPaymentListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderAndPaymentListResponseBody getBody() {
        return this.body;
    }

}
