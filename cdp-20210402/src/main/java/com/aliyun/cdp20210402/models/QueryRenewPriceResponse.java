// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryRenewPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRenewPriceResponseBody body;

    public static QueryRenewPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRenewPriceResponse self = new QueryRenewPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryRenewPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRenewPriceResponse setBody(QueryRenewPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRenewPriceResponseBody getBody() {
        return this.body;
    }

}
