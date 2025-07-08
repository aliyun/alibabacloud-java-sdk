// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsPackageNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsPackageNewResponseBody body;

    public static QuerySmsPackageNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsPackageNewResponse self = new QuerySmsPackageNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsPackageNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsPackageNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsPackageNewResponse setBody(QuerySmsPackageNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsPackageNewResponseBody getBody() {
        return this.body;
    }

}
