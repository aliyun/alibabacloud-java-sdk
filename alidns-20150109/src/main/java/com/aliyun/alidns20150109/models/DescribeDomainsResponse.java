// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainsResponseBody body;

    public static DescribeDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsResponse self = new DescribeDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainsResponse setBody(DescribeDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainsResponseBody getBody() {
        return this.body;
    }

}
