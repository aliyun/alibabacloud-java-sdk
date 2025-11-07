// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyDeviceRiskStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVerifyDeviceRiskStatisticsResponseBody body;

    public static DescribeVerifyDeviceRiskStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyDeviceRiskStatisticsResponse self = new DescribeVerifyDeviceRiskStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyDeviceRiskStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifyDeviceRiskStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVerifyDeviceRiskStatisticsResponse setBody(DescribeVerifyDeviceRiskStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifyDeviceRiskStatisticsResponseBody getBody() {
        return this.body;
    }

}
