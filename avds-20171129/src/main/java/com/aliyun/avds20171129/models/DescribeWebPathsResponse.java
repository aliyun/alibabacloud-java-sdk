// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeWebPathsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebPathsResponseBody body;

    public static DescribeWebPathsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebPathsResponse self = new DescribeWebPathsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebPathsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebPathsResponse setBody(DescribeWebPathsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebPathsResponseBody getBody() {
        return this.body;
    }

}
