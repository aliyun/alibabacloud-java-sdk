// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryOrderDetail4DistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOrderDetail4DistributionResponseBody body;

    public static QueryOrderDetail4DistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderDetail4DistributionResponse self = new QueryOrderDetail4DistributionResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderDetail4DistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderDetail4DistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderDetail4DistributionResponse setBody(QueryOrderDetail4DistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderDetail4DistributionResponseBody getBody() {
        return this.body;
    }

}
