// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNASFileSystemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeNASFileSystemsResponse setBody(DescribeNASFileSystemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNASFileSystemsResponseBody getBody() {
        return this.body;
    }

}
