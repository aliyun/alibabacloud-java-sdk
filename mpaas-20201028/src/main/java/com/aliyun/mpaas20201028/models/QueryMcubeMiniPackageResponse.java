// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcubeMiniPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMcubeMiniPackageResponseBody body;

    public static QueryMcubeMiniPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeMiniPackageResponse self = new QueryMcubeMiniPackageResponse();
        return TeaModel.build(map, self);
    }

    public QueryMcubeMiniPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMcubeMiniPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMcubeMiniPackageResponse setBody(QueryMcubeMiniPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMcubeMiniPackageResponseBody getBody() {
        return this.body;
    }

}
