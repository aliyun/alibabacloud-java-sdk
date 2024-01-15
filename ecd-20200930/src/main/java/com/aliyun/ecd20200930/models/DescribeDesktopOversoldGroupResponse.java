// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopOversoldGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDesktopOversoldGroupResponseBody body;

    public static DescribeDesktopOversoldGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopOversoldGroupResponse self = new DescribeDesktopOversoldGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopOversoldGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDesktopOversoldGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDesktopOversoldGroupResponse setBody(DescribeDesktopOversoldGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDesktopOversoldGroupResponseBody getBody() {
        return this.body;
    }

}
