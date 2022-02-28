// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeNetworksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNetworksResponseBody body;

    public static DescribeNetworksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworksResponse self = new DescribeNetworksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworksResponse setBody(DescribeNetworksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworksResponseBody getBody() {
        return this.body;
    }

}
