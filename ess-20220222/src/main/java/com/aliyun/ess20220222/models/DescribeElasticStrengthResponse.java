// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeElasticStrengthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeElasticStrengthResponseBody body;

    public static DescribeElasticStrengthResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticStrengthResponse self = new DescribeElasticStrengthResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticStrengthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticStrengthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeElasticStrengthResponse setBody(DescribeElasticStrengthResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticStrengthResponseBody getBody() {
        return this.body;
    }

}
