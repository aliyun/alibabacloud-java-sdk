// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAppProtectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAppProtectionsResponseBody body;

    public static QueryAppProtectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppProtectionsResponse self = new QueryAppProtectionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppProtectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAppProtectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAppProtectionsResponse setBody(QueryAppProtectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAppProtectionsResponseBody getBody() {
        return this.body;
    }

}
