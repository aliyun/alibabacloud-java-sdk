// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeQRCodeAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeQRCodeAuthorityResponseBody body;

    public static DescribeQRCodeAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQRCodeAuthorityResponse self = new DescribeQRCodeAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQRCodeAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQRCodeAuthorityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQRCodeAuthorityResponse setBody(DescribeQRCodeAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQRCodeAuthorityResponseBody getBody() {
        return this.body;
    }

}
