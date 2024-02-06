// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeFileSystemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFileSystemsResponseBody body;

    public static DescribeFileSystemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileSystemsResponse self = new DescribeFileSystemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFileSystemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFileSystemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFileSystemsResponse setBody(DescribeFileSystemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFileSystemsResponseBody getBody() {
        return this.body;
    }

}
