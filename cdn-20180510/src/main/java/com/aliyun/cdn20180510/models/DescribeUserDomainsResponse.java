// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeUserDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserDomainsResponse setBody(DescribeUserDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserDomainsResponseBody getBody() {
        return this.body;
    }

}
