// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDesktopGroupsResponseBody body;

    public static DescribeDesktopGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopGroupsResponse self = new DescribeDesktopGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDesktopGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDesktopGroupsResponse setBody(DescribeDesktopGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDesktopGroupsResponseBody getBody() {
        return this.body;
    }

}
