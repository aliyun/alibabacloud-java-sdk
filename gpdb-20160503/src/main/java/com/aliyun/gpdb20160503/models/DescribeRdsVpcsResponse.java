// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeRdsVpcsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRdsVpcsResponseBody body;

    public static DescribeRdsVpcsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsVpcsResponse self = new DescribeRdsVpcsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsVpcsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsVpcsResponse setBody(DescribeRdsVpcsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsVpcsResponseBody getBody() {
        return this.body;
    }

}
