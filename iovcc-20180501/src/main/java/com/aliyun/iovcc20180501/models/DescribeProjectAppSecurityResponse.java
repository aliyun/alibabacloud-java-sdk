// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeProjectAppSecurityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProjectAppSecurityResponseBody body;

    public static DescribeProjectAppSecurityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectAppSecurityResponse self = new DescribeProjectAppSecurityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectAppSecurityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectAppSecurityResponse setBody(DescribeProjectAppSecurityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectAppSecurityResponseBody getBody() {
        return this.body;
    }

}
