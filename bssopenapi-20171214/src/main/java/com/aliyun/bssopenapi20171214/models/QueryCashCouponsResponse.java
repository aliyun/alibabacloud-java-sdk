// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCashCouponsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCashCouponsResponseBody body;

    public static QueryCashCouponsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCashCouponsResponse self = new QueryCashCouponsResponse();
        return TeaModel.build(map, self);
    }

    public QueryCashCouponsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCashCouponsResponse setBody(QueryCashCouponsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCashCouponsResponseBody getBody() {
        return this.body;
    }

}
