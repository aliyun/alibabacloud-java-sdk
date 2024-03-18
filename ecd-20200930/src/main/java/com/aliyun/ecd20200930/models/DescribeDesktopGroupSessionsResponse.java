// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopGroupSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDesktopGroupSessionsResponseBody body;

    public static DescribeDesktopGroupSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopGroupSessionsResponse self = new DescribeDesktopGroupSessionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopGroupSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDesktopGroupSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDesktopGroupSessionsResponse setBody(DescribeDesktopGroupSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDesktopGroupSessionsResponseBody getBody() {
        return this.body;
    }

}
