// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeUploadTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUploadTokenResponseBody body;

    public static DescribeUploadTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadTokenResponse self = new DescribeUploadTokenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUploadTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUploadTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUploadTokenResponse setBody(DescribeUploadTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUploadTokenResponseBody getBody() {
        return this.body;
    }

}
