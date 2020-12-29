// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeRootDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRootDomainResponseBody body;

    public static DescribeRootDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRootDomainResponse self = new DescribeRootDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRootDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRootDomainResponse setBody(DescribeRootDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRootDomainResponseBody getBody() {
        return this.body;
    }

}
