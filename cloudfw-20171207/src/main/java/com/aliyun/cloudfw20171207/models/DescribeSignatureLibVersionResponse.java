// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSignatureLibVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSignatureLibVersionResponseBody body;

    public static DescribeSignatureLibVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignatureLibVersionResponse self = new DescribeSignatureLibVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSignatureLibVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSignatureLibVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSignatureLibVersionResponse setBody(DescribeSignatureLibVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSignatureLibVersionResponseBody getBody() {
        return this.body;
    }

}
