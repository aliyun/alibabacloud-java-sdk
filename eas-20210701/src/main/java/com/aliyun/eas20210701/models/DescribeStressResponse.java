// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeStressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStressResponseBody body;

    public static DescribeStressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStressResponse self = new DescribeStressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStressResponse setBody(DescribeStressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStressResponseBody getBody() {
        return this.body;
    }

}
