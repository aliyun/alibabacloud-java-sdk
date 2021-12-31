// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDesktopsResponseBody body;

    public static DescribeDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopsResponse self = new DescribeDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDesktopsResponse setBody(DescribeDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDesktopsResponseBody getBody() {
        return this.body;
    }

}
