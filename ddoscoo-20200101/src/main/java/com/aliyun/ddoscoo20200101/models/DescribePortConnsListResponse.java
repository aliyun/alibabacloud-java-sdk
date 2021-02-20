// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortConnsListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePortConnsListResponseBody body;

    public static DescribePortConnsListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortConnsListResponse self = new DescribePortConnsListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortConnsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortConnsListResponse setBody(DescribePortConnsListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortConnsListResponseBody getBody() {
        return this.body;
    }

}
