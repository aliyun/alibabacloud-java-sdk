// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclChecksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAclChecksResponseBody body;

    public static DescribeAclChecksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclChecksResponse self = new DescribeAclChecksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAclChecksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAclChecksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAclChecksResponse setBody(DescribeAclChecksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAclChecksResponseBody getBody() {
        return this.body;
    }

}
