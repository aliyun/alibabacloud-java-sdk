// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNASFileSystemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNASFileSystemsResponseBody body;

    public static DescribeNASFileSystemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNASFileSystemsResponse self = new DescribeNASFileSystemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNASFileSystemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNASFileSystemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNASFileSystemsResponse setBody(DescribeNASFileSystemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNASFileSystemsResponseBody getBody() {
        return this.body;
    }

}
