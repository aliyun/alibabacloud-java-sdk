// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParameHotKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryParameHotKeysResponseBody body;

    public static QueryParameHotKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryParameHotKeysResponse self = new QueryParameHotKeysResponse();
        return TeaModel.build(map, self);
    }

    public QueryParameHotKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryParameHotKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryParameHotKeysResponse setBody(QueryParameHotKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryParameHotKeysResponseBody getBody() {
        return this.body;
    }

}
