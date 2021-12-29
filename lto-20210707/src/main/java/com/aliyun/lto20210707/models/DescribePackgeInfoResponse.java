// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribePackgeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePackgeInfoResponseBody body;

    public static DescribePackgeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePackgeInfoResponse self = new DescribePackgeInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribePackgeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePackgeInfoResponse setBody(DescribePackgeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePackgeInfoResponseBody getBody() {
        return this.body;
    }

}
