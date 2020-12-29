// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeTrafficInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTrafficInfoResponseBody body;

    public static DescribeTrafficInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficInfoResponse self = new DescribeTrafficInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTrafficInfoResponse setBody(DescribeTrafficInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTrafficInfoResponseBody getBody() {
        return this.body;
    }

}
