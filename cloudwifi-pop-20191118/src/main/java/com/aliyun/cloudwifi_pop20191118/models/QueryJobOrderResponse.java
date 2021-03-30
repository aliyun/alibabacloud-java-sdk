// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class QueryJobOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryJobOrderResponseBody body;

    public static QueryJobOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJobOrderResponse self = new QueryJobOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryJobOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryJobOrderResponse setBody(QueryJobOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryJobOrderResponseBody getBody() {
        return this.body;
    }

}
