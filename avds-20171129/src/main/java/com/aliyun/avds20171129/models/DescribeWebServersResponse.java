// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeWebServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebServersResponseBody body;

    public static DescribeWebServersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebServersResponse self = new DescribeWebServersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebServersResponse setBody(DescribeWebServersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebServersResponseBody getBody() {
        return this.body;
    }

}
