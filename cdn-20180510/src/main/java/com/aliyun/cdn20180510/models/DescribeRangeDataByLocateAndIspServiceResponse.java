// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRangeDataByLocateAndIspServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRangeDataByLocateAndIspServiceResponseBody body;

    public static DescribeRangeDataByLocateAndIspServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRangeDataByLocateAndIspServiceResponse self = new DescribeRangeDataByLocateAndIspServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRangeDataByLocateAndIspServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRangeDataByLocateAndIspServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRangeDataByLocateAndIspServiceResponse setBody(DescribeRangeDataByLocateAndIspServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRangeDataByLocateAndIspServiceResponseBody getBody() {
        return this.body;
    }

}
