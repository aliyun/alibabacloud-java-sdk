// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class DescribeOrderInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOrderInstanceListResponseBody body;

    public static DescribeOrderInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrderInstanceListResponse self = new DescribeOrderInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrderInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrderInstanceListResponse setBody(DescribeOrderInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrderInstanceListResponseBody getBody() {
        return this.body;
    }

}
