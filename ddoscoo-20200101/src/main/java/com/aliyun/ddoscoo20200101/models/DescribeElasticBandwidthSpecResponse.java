// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeElasticBandwidthSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeElasticBandwidthSpecResponseBody body;

    public static DescribeElasticBandwidthSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticBandwidthSpecResponse self = new DescribeElasticBandwidthSpecResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticBandwidthSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticBandwidthSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeElasticBandwidthSpecResponse setBody(DescribeElasticBandwidthSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticBandwidthSpecResponseBody getBody() {
        return this.body;
    }

}
