// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeConfigOfVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConfigOfVersionResponseBody body;

    public static DescribeConfigOfVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigOfVersionResponse self = new DescribeConfigOfVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigOfVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigOfVersionResponse setBody(DescribeConfigOfVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigOfVersionResponseBody getBody() {
        return this.body;
    }

}
