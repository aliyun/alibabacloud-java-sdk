// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeUserDcdnIpaStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserDcdnIpaStatusResponseBody body;

    public static DescribeUserDcdnIpaStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDcdnIpaStatusResponse self = new DescribeUserDcdnIpaStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserDcdnIpaStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserDcdnIpaStatusResponse setBody(DescribeUserDcdnIpaStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserDcdnIpaStatusResponseBody getBody() {
        return this.body;
    }

}
