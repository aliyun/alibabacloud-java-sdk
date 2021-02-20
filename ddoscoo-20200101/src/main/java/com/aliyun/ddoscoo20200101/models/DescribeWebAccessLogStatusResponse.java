// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessLogStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebAccessLogStatusResponseBody body;

    public static DescribeWebAccessLogStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessLogStatusResponse self = new DescribeWebAccessLogStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessLogStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebAccessLogStatusResponse setBody(DescribeWebAccessLogStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebAccessLogStatusResponseBody getBody() {
        return this.body;
    }

}
