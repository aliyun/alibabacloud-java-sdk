// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderItemInfoByPaymentIdForAiZhanYouResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody body;

    public static QueryOrderItemInfoByPaymentIdForAiZhanYouResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderItemInfoByPaymentIdForAiZhanYouResponse self = new QueryOrderItemInfoByPaymentIdForAiZhanYouResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponse setBody(QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody getBody() {
        return this.body;
    }

}
