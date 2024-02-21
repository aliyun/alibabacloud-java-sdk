// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeL2VipsByDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeL2VipsByDomainResponseBody body;

    public static DescribeL2VipsByDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeL2VipsByDomainResponse self = new DescribeL2VipsByDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeL2VipsByDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeL2VipsByDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeL2VipsByDomainResponse setBody(DescribeL2VipsByDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeL2VipsByDomainResponseBody getBody() {
        return this.body;
    }

}
