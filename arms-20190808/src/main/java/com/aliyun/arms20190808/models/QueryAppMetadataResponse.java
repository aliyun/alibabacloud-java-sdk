// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryAppMetadataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAppMetadataResponseBody body;

    public static QueryAppMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppMetadataResponse self = new QueryAppMetadataResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAppMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAppMetadataResponse setBody(QueryAppMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAppMetadataResponseBody getBody() {
        return this.body;
    }

}
