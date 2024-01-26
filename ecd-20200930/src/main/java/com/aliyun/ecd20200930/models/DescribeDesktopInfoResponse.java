// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDesktopInfoResponseBody body;

    public static DescribeDesktopInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopInfoResponse self = new DescribeDesktopInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDesktopInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDesktopInfoResponse setBody(DescribeDesktopInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDesktopInfoResponseBody getBody() {
        return this.body;
    }

}
