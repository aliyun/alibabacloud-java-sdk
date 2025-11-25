// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrivateDnsStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePrivateDnsStatisticsResponseBody body;

    public static DescribePrivateDnsStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivateDnsStatisticsResponse self = new DescribePrivateDnsStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrivateDnsStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePrivateDnsStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePrivateDnsStatisticsResponse setBody(DescribePrivateDnsStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrivateDnsStatisticsResponseBody getBody() {
        return this.body;
    }

}
