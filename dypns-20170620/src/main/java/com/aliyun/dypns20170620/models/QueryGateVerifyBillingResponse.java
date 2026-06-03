// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryGateVerifyBillingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryGateVerifyBillingResponseBody body;

    public static QueryGateVerifyBillingResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGateVerifyBillingResponse self = new QueryGateVerifyBillingResponse();
        return TeaModel.build(map, self);
    }

    public QueryGateVerifyBillingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGateVerifyBillingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGateVerifyBillingResponse setBody(QueryGateVerifyBillingResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGateVerifyBillingResponseBody getBody() {
        return this.body;
    }

}
