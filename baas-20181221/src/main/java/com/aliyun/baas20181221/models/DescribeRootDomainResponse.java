// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeRootDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeRootDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRootDomainResponse setBody(DescribeRootDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRootDomainResponseBody getBody() {
        return this.body;
    }

}
