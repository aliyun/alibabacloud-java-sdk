// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDirectoriesResponseBody body;

    public static DescribeDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirectoriesResponse self = new DescribeDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDirectoriesResponse setBody(DescribeDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDirectoriesResponseBody getBody() {
        return this.body;
    }

}
