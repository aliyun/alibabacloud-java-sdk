// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeTableShardingInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTableShardingInfoResponseBody body;

    public static DescribeTableShardingInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableShardingInfoResponse self = new DescribeTableShardingInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTableShardingInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTableShardingInfoResponse setBody(DescribeTableShardingInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTableShardingInfoResponseBody getBody() {
        return this.body;
    }

}
