// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryLogistics4DistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLogistics4DistributionResponseBody body;

    public static QueryLogistics4DistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLogistics4DistributionResponse self = new QueryLogistics4DistributionResponse();
        return TeaModel.build(map, self);
    }

    public QueryLogistics4DistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLogistics4DistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLogistics4DistributionResponse setBody(QueryLogistics4DistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLogistics4DistributionResponseBody getBody() {
        return this.body;
    }

}
