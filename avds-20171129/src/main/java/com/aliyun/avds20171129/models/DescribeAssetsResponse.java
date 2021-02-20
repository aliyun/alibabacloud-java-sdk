// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeAssetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAssetsResponseBody body;

    public static DescribeAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetsResponse self = new DescribeAssetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAssetsResponse setBody(DescribeAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssetsResponseBody getBody() {
        return this.body;
    }

}
