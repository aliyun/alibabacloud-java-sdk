// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryClusterResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryClusterResourcesResponseBody body;

    public static QueryClusterResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterResourcesResponse self = new QueryClusterResourcesResponse();
        return TeaModel.build(map, self);
    }

    public QueryClusterResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryClusterResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryClusterResourcesResponse setBody(QueryClusterResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryClusterResourcesResponseBody getBody() {
        return this.body;
    }

}
