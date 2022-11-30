// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class QueryGateVerifyBillingPublicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGateVerifyBillingPublicResponseBody body;

    public static QueryGateVerifyBillingPublicResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGateVerifyBillingPublicResponse self = new QueryGateVerifyBillingPublicResponse();
        return TeaModel.build(map, self);
    }

    public QueryGateVerifyBillingPublicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGateVerifyBillingPublicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGateVerifyBillingPublicResponse setBody(QueryGateVerifyBillingPublicResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGateVerifyBillingPublicResponseBody getBody() {
        return this.body;
    }

}
