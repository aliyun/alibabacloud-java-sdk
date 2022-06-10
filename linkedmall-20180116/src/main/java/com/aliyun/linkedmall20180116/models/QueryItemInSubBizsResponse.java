// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemInSubBizsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryItemInSubBizsResponseBody body;

    public static QueryItemInSubBizsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemInSubBizsResponse self = new QueryItemInSubBizsResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemInSubBizsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryItemInSubBizsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryItemInSubBizsResponse setBody(QueryItemInSubBizsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryItemInSubBizsResponseBody getBody() {
        return this.body;
    }

}
