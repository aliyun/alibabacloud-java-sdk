// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCcProtectSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebCcProtectSwitchResponseBody body;

    public static DescribeWebCcProtectSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCcProtectSwitchResponse self = new DescribeWebCcProtectSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebCcProtectSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebCcProtectSwitchResponse setBody(DescribeWebCcProtectSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebCcProtectSwitchResponseBody getBody() {
        return this.body;
    }

}
