// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryResourcePackageInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryResourcePackageInstancesResponseBody body;

    public static QueryResourcePackageInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResourcePackageInstancesResponse self = new QueryResourcePackageInstancesResponse();
        return TeaModel.build(map, self);
    }

    public QueryResourcePackageInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryResourcePackageInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryResourcePackageInstancesResponse setBody(QueryResourcePackageInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryResourcePackageInstancesResponseBody getBody() {
        return this.body;
    }

}
