// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRDDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRDDomainsResponseBody body;

    public static DescribeRDDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDDomainsResponse self = new DescribeRDDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRDDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRDDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRDDomainsResponse setBody(DescribeRDDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRDDomainsResponseBody getBody() {
        return this.body;
    }

}
