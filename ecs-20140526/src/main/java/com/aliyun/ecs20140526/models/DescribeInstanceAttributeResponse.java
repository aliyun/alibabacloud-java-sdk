// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceAttributeResponseBody body;

    public static DescribeInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeResponse self = new DescribeInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceAttributeResponse setBody(DescribeInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
