// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSourceFailureTopIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSourceFailureTopIpResponseBody body;

    public static DescribeSourceFailureTopIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSourceFailureTopIpResponse self = new DescribeSourceFailureTopIpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSourceFailureTopIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSourceFailureTopIpResponse setBody(DescribeSourceFailureTopIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSourceFailureTopIpResponseBody getBody() {
        return this.body;
    }

}
