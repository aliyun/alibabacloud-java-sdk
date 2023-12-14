// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAuthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAuthResponseBody body;

    public static DescribeAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthResponse self = new DescribeAuthResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuthResponse setBody(DescribeAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuthResponseBody getBody() {
        return this.body;
    }

}
