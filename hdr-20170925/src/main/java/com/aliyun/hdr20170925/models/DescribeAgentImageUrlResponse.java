// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeAgentImageUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAgentImageUrlResponseBody body;

    public static DescribeAgentImageUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgentImageUrlResponse self = new DescribeAgentImageUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgentImageUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgentImageUrlResponse setBody(DescribeAgentImageUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgentImageUrlResponseBody getBody() {
        return this.body;
    }

}
