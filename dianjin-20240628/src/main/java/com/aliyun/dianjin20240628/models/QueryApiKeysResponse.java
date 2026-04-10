// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class QueryApiKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryApiKeysResponseBody body;

    public static QueryApiKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApiKeysResponse self = new QueryApiKeysResponse();
        return TeaModel.build(map, self);
    }

    public QueryApiKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryApiKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryApiKeysResponse setBody(QueryApiKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryApiKeysResponseBody getBody() {
        return this.body;
    }

}
