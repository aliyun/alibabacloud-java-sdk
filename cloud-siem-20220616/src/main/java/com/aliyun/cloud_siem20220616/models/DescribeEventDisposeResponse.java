// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeEventDisposeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEventDisposeResponseBody body;

    public static DescribeEventDisposeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventDisposeResponse self = new DescribeEventDisposeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventDisposeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventDisposeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventDisposeResponse setBody(DescribeEventDisposeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventDisposeResponseBody getBody() {
        return this.body;
    }

}
