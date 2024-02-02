// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageComponentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageComponentsResponseBody body;

    public static DescribeImageComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageComponentsResponse self = new DescribeImageComponentsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageComponentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageComponentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageComponentsResponse setBody(DescribeImageComponentsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageComponentsResponseBody getBody() {
        return this.body;
    }

}
