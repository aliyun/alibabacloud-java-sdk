// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribePortsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePortsResponseBody body;

    public static DescribePortsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortsResponse self = new DescribePortsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortsResponse setBody(DescribePortsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortsResponseBody getBody() {
        return this.body;
    }

}
