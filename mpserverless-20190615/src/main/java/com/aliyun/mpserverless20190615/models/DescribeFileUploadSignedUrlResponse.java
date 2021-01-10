// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeFileUploadSignedUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeFileUploadSignedUrlResponse setBody(DescribeFileUploadSignedUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFileUploadSignedUrlResponseBody getBody() {
        return this.body;
    }

}
