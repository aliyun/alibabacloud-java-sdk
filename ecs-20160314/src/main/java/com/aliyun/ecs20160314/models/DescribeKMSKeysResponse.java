// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeKMSKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeKMSKeysResponseBody body;

    public static DescribeKMSKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKMSKeysResponse self = new DescribeKMSKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKMSKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKMSKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKMSKeysResponse setBody(DescribeKMSKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKMSKeysResponseBody getBody() {
        return this.body;
    }

}
