// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInstanceDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceDomainsResponseBody body;

    public static DescribeInstanceDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDomainsResponse self = new DescribeInstanceDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceDomainsResponse setBody(DescribeInstanceDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceDomainsResponseBody getBody() {
        return this.body;
    }

}
