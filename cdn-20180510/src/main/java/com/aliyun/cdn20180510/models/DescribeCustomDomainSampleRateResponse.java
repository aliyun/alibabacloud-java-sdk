// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCustomDomainSampleRateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomDomainSampleRateResponseBody body;

    public static DescribeCustomDomainSampleRateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomDomainSampleRateResponse self = new DescribeCustomDomainSampleRateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomDomainSampleRateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomDomainSampleRateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomDomainSampleRateResponse setBody(DescribeCustomDomainSampleRateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomDomainSampleRateResponseBody getBody() {
        return this.body;
    }

}
