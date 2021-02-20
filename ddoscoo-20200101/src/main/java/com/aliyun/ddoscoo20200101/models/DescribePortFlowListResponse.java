// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortFlowListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePortFlowListResponseBody body;

    public static DescribePortFlowListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortFlowListResponse self = new DescribePortFlowListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortFlowListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortFlowListResponse setBody(DescribePortFlowListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortFlowListResponseBody getBody() {
        return this.body;
    }

}
