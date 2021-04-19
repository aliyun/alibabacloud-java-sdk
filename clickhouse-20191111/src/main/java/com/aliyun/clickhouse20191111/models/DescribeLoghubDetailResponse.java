// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLoghubDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLoghubDetailResponseBody body;

    public static DescribeLoghubDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoghubDetailResponse self = new DescribeLoghubDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoghubDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoghubDetailResponse setBody(DescribeLoghubDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoghubDetailResponseBody getBody() {
        return this.body;
    }

}
