// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeKmsServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeKmsServerResponseBody body;

    public static DescribeKmsServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsServerResponse self = new DescribeKmsServerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKmsServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKmsServerResponse setBody(DescribeKmsServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKmsServerResponseBody getBody() {
        return this.body;
    }

}
