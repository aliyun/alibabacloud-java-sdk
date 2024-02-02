// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeActivationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeActivationsResponseBody body;

    public static DescribeActivationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActivationsResponse self = new DescribeActivationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActivationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActivationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeActivationsResponse setBody(DescribeActivationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActivationsResponseBody getBody() {
        return this.body;
    }

}
