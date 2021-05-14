// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeShardTaskListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeShardTaskListResponseBody body;

    public static DescribeShardTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardTaskListResponse self = new DescribeShardTaskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeShardTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeShardTaskListResponse setBody(DescribeShardTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeShardTaskListResponseBody getBody() {
        return this.body;
    }

}
