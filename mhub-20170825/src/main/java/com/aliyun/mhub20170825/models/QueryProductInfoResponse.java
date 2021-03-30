// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryProductInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryProductInfoResponseBody body;

    public static QueryProductInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductInfoResponse self = new QueryProductInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProductInfoResponse setBody(QueryProductInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProductInfoResponseBody getBody() {
        return this.body;
    }

}
