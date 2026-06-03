// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QuerySdkVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySdkVersionResponseBody body;

    public static QuerySdkVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySdkVersionResponse self = new QuerySdkVersionResponse();
        return TeaModel.build(map, self);
    }

    public QuerySdkVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySdkVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySdkVersionResponse setBody(QuerySdkVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySdkVersionResponseBody getBody() {
        return this.body;
    }

}
