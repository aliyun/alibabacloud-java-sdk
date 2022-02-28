// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeReplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReplicationResponseBody body;

    public static DescribeReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationResponse self = new DescribeReplicationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReplicationResponse setBody(DescribeReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReplicationResponseBody getBody() {
        return this.body;
    }

}
