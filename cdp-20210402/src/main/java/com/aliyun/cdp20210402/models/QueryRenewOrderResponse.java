// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryRenewOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRenewOrderResponseBody body;

    public static QueryRenewOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRenewOrderResponse self = new QueryRenewOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryRenewOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRenewOrderResponse setBody(QueryRenewOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRenewOrderResponseBody getBody() {
        return this.body;
    }

}
