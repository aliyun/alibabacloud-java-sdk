// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeElasticQpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeElasticQpsResponseBody body;

    public static DescribeElasticQpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticQpsResponse self = new DescribeElasticQpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticQpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticQpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeElasticQpsResponse setBody(DescribeElasticQpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticQpsResponseBody getBody() {
        return this.body;
    }

}
