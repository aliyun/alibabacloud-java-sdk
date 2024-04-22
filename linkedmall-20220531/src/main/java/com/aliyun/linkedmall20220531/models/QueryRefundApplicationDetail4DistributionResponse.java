// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryRefundApplicationDetail4DistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRefundApplicationDetail4DistributionResponseBody body;

    public static QueryRefundApplicationDetail4DistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRefundApplicationDetail4DistributionResponse self = new QueryRefundApplicationDetail4DistributionResponse();
        return TeaModel.build(map, self);
    }

    public QueryRefundApplicationDetail4DistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRefundApplicationDetail4DistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRefundApplicationDetail4DistributionResponse setBody(QueryRefundApplicationDetail4DistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRefundApplicationDetail4DistributionResponseBody getBody() {
        return this.body;
    }

}
