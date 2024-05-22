// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribeLogisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogisticsResponseBody body;

    public static DescribeLogisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogisticsResponse self = new DescribeLogisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogisticsResponse setBody(DescribeLogisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogisticsResponseBody getBody() {
        return this.body;
    }

}
