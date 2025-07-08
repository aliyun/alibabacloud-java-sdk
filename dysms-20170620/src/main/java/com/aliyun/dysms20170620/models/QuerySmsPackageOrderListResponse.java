// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsPackageOrderListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsPackageOrderListResponseBody body;

    public static QuerySmsPackageOrderListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsPackageOrderListResponse self = new QuerySmsPackageOrderListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsPackageOrderListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsPackageOrderListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsPackageOrderListResponse setBody(QuerySmsPackageOrderListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsPackageOrderListResponseBody getBody() {
        return this.body;
    }

}
