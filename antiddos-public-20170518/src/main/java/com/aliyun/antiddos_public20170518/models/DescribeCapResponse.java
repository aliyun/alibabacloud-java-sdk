// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeCapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCapResponseBody body;

    public static DescribeCapResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapResponse self = new DescribeCapResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCapResponse setBody(DescribeCapResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCapResponseBody getBody() {
        return this.body;
    }

}
