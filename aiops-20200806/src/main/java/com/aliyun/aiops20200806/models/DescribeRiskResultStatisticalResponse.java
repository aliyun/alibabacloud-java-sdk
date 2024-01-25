// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeRiskResultStatisticalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskResultStatisticalResponseBody body;

    public static DescribeRiskResultStatisticalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskResultStatisticalResponse self = new DescribeRiskResultStatisticalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskResultStatisticalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskResultStatisticalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskResultStatisticalResponse setBody(DescribeRiskResultStatisticalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskResultStatisticalResponseBody getBody() {
        return this.body;
    }

}
