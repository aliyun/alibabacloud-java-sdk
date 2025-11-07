// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyPersonasOsStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVerifyPersonasOsStatisticsResponseBody body;

    public static DescribeVerifyPersonasOsStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyPersonasOsStatisticsResponse self = new DescribeVerifyPersonasOsStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyPersonasOsStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifyPersonasOsStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVerifyPersonasOsStatisticsResponse setBody(DescribeVerifyPersonasOsStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifyPersonasOsStatisticsResponseBody getBody() {
        return this.body;
    }

}
