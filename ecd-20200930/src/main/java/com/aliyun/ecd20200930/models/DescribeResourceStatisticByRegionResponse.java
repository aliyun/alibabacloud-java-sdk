// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeResourceStatisticByRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceStatisticByRegionResponseBody body;

    public static DescribeResourceStatisticByRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceStatisticByRegionResponse self = new DescribeResourceStatisticByRegionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceStatisticByRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceStatisticByRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceStatisticByRegionResponse setBody(DescribeResourceStatisticByRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceStatisticByRegionResponseBody getBody() {
        return this.body;
    }

}
