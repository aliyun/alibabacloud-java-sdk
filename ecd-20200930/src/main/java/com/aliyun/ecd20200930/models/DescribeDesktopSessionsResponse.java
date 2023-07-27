// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopSessionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDesktopSessionsResponseBody body;

    public static DescribeDesktopSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopSessionsResponse self = new DescribeDesktopSessionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDesktopSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDesktopSessionsResponse setBody(DescribeDesktopSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDesktopSessionsResponseBody getBody() {
        return this.body;
    }

}
