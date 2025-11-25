// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEcsTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInvadeEcsTrendResponseBody body;

    public static DescribeInvadeEcsTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEcsTrendResponse self = new DescribeInvadeEcsTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEcsTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInvadeEcsTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInvadeEcsTrendResponse setBody(DescribeInvadeEcsTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInvadeEcsTrendResponseBody getBody() {
        return this.body;
    }

}
