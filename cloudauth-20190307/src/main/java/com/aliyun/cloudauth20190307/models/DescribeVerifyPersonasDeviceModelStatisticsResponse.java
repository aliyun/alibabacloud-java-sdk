// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyPersonasDeviceModelStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVerifyPersonasDeviceModelStatisticsResponseBody body;

    public static DescribeVerifyPersonasDeviceModelStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyPersonasDeviceModelStatisticsResponse self = new DescribeVerifyPersonasDeviceModelStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyPersonasDeviceModelStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifyPersonasDeviceModelStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVerifyPersonasDeviceModelStatisticsResponse setBody(DescribeVerifyPersonasDeviceModelStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifyPersonasDeviceModelStatisticsResponseBody getBody() {
        return this.body;
    }

}
