// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAdvicesResponseBody body;

    public static DescribeAdvicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvicesResponse self = new DescribeAdvicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdvicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdvicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdvicesResponse setBody(DescribeAdvicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdvicesResponseBody getBody() {
        return this.body;
    }

}
