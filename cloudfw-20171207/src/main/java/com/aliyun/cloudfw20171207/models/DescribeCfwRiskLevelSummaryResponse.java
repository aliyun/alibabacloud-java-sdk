// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeCfwRiskLevelSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCfwRiskLevelSummaryResponseBody body;

    public static DescribeCfwRiskLevelSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCfwRiskLevelSummaryResponse self = new DescribeCfwRiskLevelSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCfwRiskLevelSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCfwRiskLevelSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCfwRiskLevelSummaryResponse setBody(DescribeCfwRiskLevelSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCfwRiskLevelSummaryResponseBody getBody() {
        return this.body;
    }

}
