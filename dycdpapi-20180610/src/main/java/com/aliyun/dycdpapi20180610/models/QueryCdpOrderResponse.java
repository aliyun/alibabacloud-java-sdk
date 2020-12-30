// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dycdpapi20180610.models;

import com.aliyun.tea.*;

public class QueryCdpOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCdpOrderResponseBody body;

    public static QueryCdpOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCdpOrderResponse self = new QueryCdpOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryCdpOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCdpOrderResponse setBody(QueryCdpOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCdpOrderResponseBody getBody() {
        return this.body;
    }

}
