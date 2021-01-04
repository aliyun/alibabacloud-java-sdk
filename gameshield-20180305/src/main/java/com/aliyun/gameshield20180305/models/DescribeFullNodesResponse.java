// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFullNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFullNodesResponseBody body;

    public static DescribeFullNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFullNodesResponse self = new DescribeFullNodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFullNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFullNodesResponse setBody(DescribeFullNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFullNodesResponseBody getBody() {
        return this.body;
    }

}
