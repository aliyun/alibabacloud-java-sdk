// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryPackageTypeInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPackageTypeInfoResponseBody body;

    public static QueryPackageTypeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPackageTypeInfoResponse self = new QueryPackageTypeInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryPackageTypeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPackageTypeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPackageTypeInfoResponse setBody(QueryPackageTypeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPackageTypeInfoResponseBody getBody() {
        return this.body;
    }

}
