// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsPackageDetailNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsPackageDetailNewResponseBody body;

    public static QuerySmsPackageDetailNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsPackageDetailNewResponse self = new QuerySmsPackageDetailNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsPackageDetailNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsPackageDetailNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsPackageDetailNewResponse setBody(QuerySmsPackageDetailNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsPackageDetailNewResponseBody getBody() {
        return this.body;
    }

}
