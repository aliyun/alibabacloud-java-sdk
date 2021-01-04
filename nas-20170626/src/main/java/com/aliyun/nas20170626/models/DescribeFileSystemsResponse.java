// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFileSystemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeFileSystemsResponse setBody(DescribeFileSystemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFileSystemsResponseBody getBody() {
        return this.body;
    }

}
