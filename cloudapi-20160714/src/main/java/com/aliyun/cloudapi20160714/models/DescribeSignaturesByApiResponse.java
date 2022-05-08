// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSignaturesByApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSignaturesByApiResponseBody body;

    public static DescribeSignaturesByApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignaturesByApiResponse self = new DescribeSignaturesByApiResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSignaturesByApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSignaturesByApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSignaturesByApiResponse setBody(DescribeSignaturesByApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSignaturesByApiResponseBody getBody() {
        return this.body;
    }

}
