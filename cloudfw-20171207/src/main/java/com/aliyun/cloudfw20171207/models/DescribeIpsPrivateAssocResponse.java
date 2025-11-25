// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeIpsPrivateAssocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIpsPrivateAssocResponseBody body;

    public static DescribeIpsPrivateAssocResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpsPrivateAssocResponse self = new DescribeIpsPrivateAssocResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpsPrivateAssocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpsPrivateAssocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpsPrivateAssocResponse setBody(DescribeIpsPrivateAssocResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpsPrivateAssocResponseBody getBody() {
        return this.body;
    }

}
