// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppVersionResponseBody body;

    public static DescribeAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppVersionResponse self = new DescribeAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppVersionResponse setBody(DescribeAppVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppVersionResponseBody getBody() {
        return this.body;
    }

}
