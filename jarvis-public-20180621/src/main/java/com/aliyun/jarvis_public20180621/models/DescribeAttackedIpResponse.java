// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeAttackedIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAttackedIpResponseBody body;

    public static DescribeAttackedIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackedIpResponse self = new DescribeAttackedIpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAttackedIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAttackedIpResponse setBody(DescribeAttackedIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAttackedIpResponseBody getBody() {
        return this.body;
    }

}
