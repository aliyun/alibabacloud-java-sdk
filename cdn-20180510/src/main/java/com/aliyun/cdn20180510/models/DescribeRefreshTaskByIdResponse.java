// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTaskByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRefreshTaskByIdResponseBody body;

    public static DescribeRefreshTaskByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefreshTaskByIdResponse self = new DescribeRefreshTaskByIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRefreshTaskByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRefreshTaskByIdResponse setBody(DescribeRefreshTaskByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRefreshTaskByIdResponseBody getBody() {
        return this.body;
    }

}
