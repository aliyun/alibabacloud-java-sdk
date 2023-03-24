// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeElasticPlansResponseBody body;

    public static DescribeElasticPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlansResponse self = new DescribeElasticPlansResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeElasticPlansResponse setBody(DescribeElasticPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticPlansResponseBody getBody() {
        return this.body;
    }

}
