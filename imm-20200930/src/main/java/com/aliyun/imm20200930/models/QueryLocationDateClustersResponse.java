// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryLocationDateClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLocationDateClustersResponseBody body;

    public static QueryLocationDateClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLocationDateClustersResponse self = new QueryLocationDateClustersResponse();
        return TeaModel.build(map, self);
    }

    public QueryLocationDateClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLocationDateClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLocationDateClustersResponse setBody(QueryLocationDateClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLocationDateClustersResponseBody getBody() {
        return this.body;
    }

}
