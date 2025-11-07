// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyPersonasProvinceStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVerifyPersonasProvinceStatisticsResponseBody body;

    public static DescribeVerifyPersonasProvinceStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyPersonasProvinceStatisticsResponse self = new DescribeVerifyPersonasProvinceStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyPersonasProvinceStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifyPersonasProvinceStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVerifyPersonasProvinceStatisticsResponse setBody(DescribeVerifyPersonasProvinceStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifyPersonasProvinceStatisticsResponseBody getBody() {
        return this.body;
    }

}
