// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortViewSourceProvincesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePortViewSourceProvincesResponseBody body;

    public static DescribePortViewSourceProvincesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortViewSourceProvincesResponse self = new DescribePortViewSourceProvincesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortViewSourceProvincesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortViewSourceProvincesResponse setBody(DescribePortViewSourceProvincesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortViewSourceProvincesResponseBody getBody() {
        return this.body;
    }

}
