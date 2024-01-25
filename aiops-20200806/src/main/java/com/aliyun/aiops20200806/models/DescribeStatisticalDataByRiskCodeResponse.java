// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeStatisticalDataByRiskCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStatisticalDataByRiskCodeResponseBody body;

    public static DescribeStatisticalDataByRiskCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatisticalDataByRiskCodeResponse self = new DescribeStatisticalDataByRiskCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStatisticalDataByRiskCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStatisticalDataByRiskCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStatisticalDataByRiskCodeResponse setBody(DescribeStatisticalDataByRiskCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStatisticalDataByRiskCodeResponseBody getBody() {
        return this.body;
    }

}
