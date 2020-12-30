// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeUploadPreSignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUploadPreSignResponseBody body;

    public static DescribeUploadPreSignResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadPreSignResponse self = new DescribeUploadPreSignResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUploadPreSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUploadPreSignResponse setBody(DescribeUploadPreSignResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUploadPreSignResponseBody getBody() {
        return this.body;
    }

}
