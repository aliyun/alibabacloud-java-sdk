// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAclCheckResponseBody body;

    public static DescribeAclCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclCheckResponse self = new DescribeAclCheckResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAclCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAclCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAclCheckResponse setBody(DescribeAclCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAclCheckResponseBody getBody() {
        return this.body;
    }

}
