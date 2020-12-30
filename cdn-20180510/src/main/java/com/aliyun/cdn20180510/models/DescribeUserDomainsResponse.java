// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserDomainsResponseBody body;

    public static DescribeUserDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDomainsResponse self = new DescribeUserDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserDomainsResponse setBody(DescribeUserDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserDomainsResponseBody getBody() {
        return this.body;
    }

}
