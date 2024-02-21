// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserVipsByDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserVipsByDomainResponseBody body;

    public static DescribeUserVipsByDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVipsByDomainResponse self = new DescribeUserVipsByDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserVipsByDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserVipsByDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserVipsByDomainResponse setBody(DescribeUserVipsByDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserVipsByDomainResponseBody getBody() {
        return this.body;
    }

}
