// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainsResponseBody body;

    public static DescribeAntChainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainsResponse self = new DescribeAntChainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainsResponse setBody(DescribeAntChainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainsResponseBody getBody() {
        return this.body;
    }

}
