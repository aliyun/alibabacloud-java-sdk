// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class QueryProductPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProductPageResponseBody body;

    public static QueryProductPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductPageResponse self = new QueryProductPageResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProductPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProductPageResponse setBody(QueryProductPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProductPageResponseBody getBody() {
        return this.body;
    }

}
