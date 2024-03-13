// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeCostBudgetsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCostBudgetsSummaryResponseBody body;

    public static DescribeCostBudgetsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostBudgetsSummaryResponse self = new DescribeCostBudgetsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCostBudgetsSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCostBudgetsSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCostBudgetsSummaryResponse setBody(DescribeCostBudgetsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCostBudgetsSummaryResponseBody getBody() {
        return this.body;
    }

}
