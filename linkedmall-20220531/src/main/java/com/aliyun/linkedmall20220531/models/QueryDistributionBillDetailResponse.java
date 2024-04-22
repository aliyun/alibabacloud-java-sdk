// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionBillDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDistributionBillDetailResponseBody body;

    public static QueryDistributionBillDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionBillDetailResponse self = new QueryDistributionBillDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryDistributionBillDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDistributionBillDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDistributionBillDetailResponse setBody(QueryDistributionBillDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDistributionBillDetailResponseBody getBody() {
        return this.body;
    }

}
