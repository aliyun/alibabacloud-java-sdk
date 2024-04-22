// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryOrderList4DistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOrderList4DistributionResponseBody body;

    public static QueryOrderList4DistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderList4DistributionResponse self = new QueryOrderList4DistributionResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderList4DistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderList4DistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderList4DistributionResponse setBody(QueryOrderList4DistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderList4DistributionResponseBody getBody() {
        return this.body;
    }

}
