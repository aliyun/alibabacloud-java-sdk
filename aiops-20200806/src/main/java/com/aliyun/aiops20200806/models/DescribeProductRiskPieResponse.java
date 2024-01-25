// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeProductRiskPieResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProductRiskPieResponseBody body;

    public static DescribeProductRiskPieResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductRiskPieResponse self = new DescribeProductRiskPieResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProductRiskPieResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProductRiskPieResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProductRiskPieResponse setBody(DescribeProductRiskPieResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProductRiskPieResponseBody getBody() {
        return this.body;
    }

}
