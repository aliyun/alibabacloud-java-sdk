// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPriceResponseBody body;

    public static QueryPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPriceResponse self = new QueryPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPriceResponse setBody(QueryPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPriceResponseBody getBody() {
        return this.body;
    }

}
