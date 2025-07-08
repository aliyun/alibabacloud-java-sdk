// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsPackageOrderListNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsPackageOrderListNewResponseBody body;

    public static QuerySmsPackageOrderListNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsPackageOrderListNewResponse self = new QuerySmsPackageOrderListNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsPackageOrderListNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsPackageOrderListNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsPackageOrderListNewResponse setBody(QuerySmsPackageOrderListNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsPackageOrderListNewResponseBody getBody() {
        return this.body;
    }

}
