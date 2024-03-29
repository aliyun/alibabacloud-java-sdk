// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DescribeVscMountPointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVscMountPointsResponseBody body;

    public static DescribeVscMountPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVscMountPointsResponse self = new DescribeVscMountPointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVscMountPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVscMountPointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVscMountPointsResponse setBody(DescribeVscMountPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVscMountPointsResponseBody getBody() {
        return this.body;
    }

}
