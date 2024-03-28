// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeFileUploadSignedUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFileUploadSignedUrlResponseBody body;

    public static DescribeFileUploadSignedUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileUploadSignedUrlResponse self = new DescribeFileUploadSignedUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFileUploadSignedUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFileUploadSignedUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFileUploadSignedUrlResponse setBody(DescribeFileUploadSignedUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFileUploadSignedUrlResponseBody getBody() {
        return this.body;
    }

}
