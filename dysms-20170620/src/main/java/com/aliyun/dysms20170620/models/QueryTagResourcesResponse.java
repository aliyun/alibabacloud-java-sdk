// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTagResourcesResponseBody body;

    public static QueryTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTagResourcesResponse self = new QueryTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public QueryTagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTagResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTagResourcesResponse setBody(QueryTagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTagResourcesResponseBody getBody() {
        return this.body;
    }

}
