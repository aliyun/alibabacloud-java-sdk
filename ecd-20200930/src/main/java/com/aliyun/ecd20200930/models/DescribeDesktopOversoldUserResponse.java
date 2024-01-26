// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopOversoldUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDesktopOversoldUserResponseBody body;

    public static DescribeDesktopOversoldUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopOversoldUserResponse self = new DescribeDesktopOversoldUserResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopOversoldUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDesktopOversoldUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDesktopOversoldUserResponse setBody(DescribeDesktopOversoldUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDesktopOversoldUserResponseBody getBody() {
        return this.body;
    }

}
