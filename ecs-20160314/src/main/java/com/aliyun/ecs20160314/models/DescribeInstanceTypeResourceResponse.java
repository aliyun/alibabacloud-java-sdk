// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypeResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceTypeResourceResponseBody body;

    public static DescribeInstanceTypeResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypeResourceResponse self = new DescribeInstanceTypeResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypeResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceTypeResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceTypeResourceResponse setBody(DescribeInstanceTypeResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceTypeResourceResponseBody getBody() {
        return this.body;
    }

}
