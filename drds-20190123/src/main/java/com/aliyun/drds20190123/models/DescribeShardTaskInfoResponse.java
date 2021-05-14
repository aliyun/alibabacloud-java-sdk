// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeShardTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeShardTaskInfoResponseBody body;

    public static DescribeShardTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardTaskInfoResponse self = new DescribeShardTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeShardTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeShardTaskInfoResponse setBody(DescribeShardTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeShardTaskInfoResponseBody getBody() {
        return this.body;
    }

}
