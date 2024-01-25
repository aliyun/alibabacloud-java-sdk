// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSignaturesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSignaturesResponseBody body;

    public static DescribeSignaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignaturesResponse self = new DescribeSignaturesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSignaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSignaturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSignaturesResponse setBody(DescribeSignaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSignaturesResponseBody getBody() {
        return this.body;
    }

}
