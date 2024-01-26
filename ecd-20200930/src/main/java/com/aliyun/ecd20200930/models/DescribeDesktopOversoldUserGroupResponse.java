// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopOversoldUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDesktopOversoldUserGroupResponseBody body;

    public static DescribeDesktopOversoldUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopOversoldUserGroupResponse self = new DescribeDesktopOversoldUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopOversoldUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDesktopOversoldUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDesktopOversoldUserGroupResponse setBody(DescribeDesktopOversoldUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDesktopOversoldUserGroupResponseBody getBody() {
        return this.body;
    }

}
