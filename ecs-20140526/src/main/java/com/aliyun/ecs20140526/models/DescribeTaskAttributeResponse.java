// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTaskAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTaskAttributeResponseBody body;

    public static DescribeTaskAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskAttributeResponse self = new DescribeTaskAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTaskAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTaskAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTaskAttributeResponse setBody(DescribeTaskAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTaskAttributeResponseBody getBody() {
        return this.body;
    }

}
