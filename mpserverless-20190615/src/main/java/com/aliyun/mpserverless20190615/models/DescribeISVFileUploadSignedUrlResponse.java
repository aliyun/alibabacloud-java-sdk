// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeISVFileUploadSignedUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeISVFileUploadSignedUrlResponseBody body;

    public static DescribeISVFileUploadSignedUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeISVFileUploadSignedUrlResponse self = new DescribeISVFileUploadSignedUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeISVFileUploadSignedUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeISVFileUploadSignedUrlResponse setBody(DescribeISVFileUploadSignedUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeISVFileUploadSignedUrlResponseBody getBody() {
        return this.body;
    }

}
