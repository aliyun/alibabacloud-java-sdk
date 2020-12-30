// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeOssUploadTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOssUploadTokenResponseBody body;

    public static DescribeOssUploadTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssUploadTokenResponse self = new DescribeOssUploadTokenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssUploadTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssUploadTokenResponse setBody(DescribeOssUploadTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssUploadTokenResponseBody getBody() {
        return this.body;
    }

}
