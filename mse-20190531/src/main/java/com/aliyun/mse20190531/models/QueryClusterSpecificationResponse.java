// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterSpecificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryClusterSpecificationResponseBody body;

    public static QueryClusterSpecificationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterSpecificationResponse self = new QueryClusterSpecificationResponse();
        return TeaModel.build(map, self);
    }

    public QueryClusterSpecificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryClusterSpecificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryClusterSpecificationResponse setBody(QueryClusterSpecificationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryClusterSpecificationResponseBody getBody() {
        return this.body;
    }

}
