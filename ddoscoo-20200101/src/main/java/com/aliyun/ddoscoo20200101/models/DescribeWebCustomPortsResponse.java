// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCustomPortsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebCustomPortsResponseBody body;

    public static DescribeWebCustomPortsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCustomPortsResponse self = new DescribeWebCustomPortsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebCustomPortsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebCustomPortsResponse setBody(DescribeWebCustomPortsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebCustomPortsResponseBody getBody() {
        return this.body;
    }

}
