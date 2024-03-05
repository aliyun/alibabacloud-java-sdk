// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeEstackImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEstackImageResponseBody body;

    public static DescribeEstackImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEstackImageResponse self = new DescribeEstackImageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEstackImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEstackImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEstackImageResponse setBody(DescribeEstackImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEstackImageResponseBody getBody() {
        return this.body;
    }

}
