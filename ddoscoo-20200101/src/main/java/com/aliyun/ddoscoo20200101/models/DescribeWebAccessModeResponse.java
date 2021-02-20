// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebAccessModeResponseBody body;

    public static DescribeWebAccessModeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessModeResponse self = new DescribeWebAccessModeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebAccessModeResponse setBody(DescribeWebAccessModeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebAccessModeResponseBody getBody() {
        return this.body;
    }

}
