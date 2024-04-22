// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionMallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDistributionMallResponseBody body;

    public static QueryDistributionMallResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionMallResponse self = new QueryDistributionMallResponse();
        return TeaModel.build(map, self);
    }

    public QueryDistributionMallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDistributionMallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDistributionMallResponse setBody(QueryDistributionMallResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDistributionMallResponseBody getBody() {
        return this.body;
    }

}
