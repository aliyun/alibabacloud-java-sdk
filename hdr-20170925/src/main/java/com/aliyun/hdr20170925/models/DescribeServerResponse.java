// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServerResponseBody body;

    public static DescribeServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerResponse self = new DescribeServerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServerResponse setBody(DescribeServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServerResponseBody getBody() {
        return this.body;
    }

}
