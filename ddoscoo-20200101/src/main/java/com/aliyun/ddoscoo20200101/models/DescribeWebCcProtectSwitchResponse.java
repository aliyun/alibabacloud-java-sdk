// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCcProtectSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeWebCcProtectSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebCcProtectSwitchResponse setBody(DescribeWebCcProtectSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebCcProtectSwitchResponseBody getBody() {
        return this.body;
    }

}
