// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImagesResponseBody body;

    public static DescribeImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagesResponse self = new DescribeImagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImagesResponse setBody(DescribeImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImagesResponseBody getBody() {
        return this.body;
    }

}
