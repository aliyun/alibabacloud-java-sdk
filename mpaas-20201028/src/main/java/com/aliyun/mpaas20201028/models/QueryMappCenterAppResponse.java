// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMappCenterAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMappCenterAppResponseBody body;

    public static QueryMappCenterAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMappCenterAppResponse self = new QueryMappCenterAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryMappCenterAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMappCenterAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMappCenterAppResponse setBody(QueryMappCenterAppResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMappCenterAppResponseBody getBody() {
        return this.body;
    }

}
