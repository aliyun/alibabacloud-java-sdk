// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryItemDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryItemDetailResponseBody body;

    public static QueryItemDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailResponse self = new QueryItemDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryItemDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryItemDetailResponse setBody(QueryItemDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryItemDetailResponseBody getBody() {
        return this.body;
    }

}
