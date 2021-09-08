// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryProductListResponseBody body;

    public static QueryProductListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductListResponse self = new QueryProductListResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProductListResponse setBody(QueryProductListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProductListResponseBody getBody() {
        return this.body;
    }

}
