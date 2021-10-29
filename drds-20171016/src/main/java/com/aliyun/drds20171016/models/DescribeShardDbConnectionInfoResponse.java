// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeShardDbConnectionInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeShardDbConnectionInfoResponseBody body;

    public static DescribeShardDbConnectionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardDbConnectionInfoResponse self = new DescribeShardDbConnectionInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeShardDbConnectionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeShardDbConnectionInfoResponse setBody(DescribeShardDbConnectionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeShardDbConnectionInfoResponseBody getBody() {
        return this.body;
    }

}
