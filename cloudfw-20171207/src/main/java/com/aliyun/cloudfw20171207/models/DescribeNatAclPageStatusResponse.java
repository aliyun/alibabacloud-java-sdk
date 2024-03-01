// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatAclPageStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNatAclPageStatusResponseBody body;

    public static DescribeNatAclPageStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatAclPageStatusResponse self = new DescribeNatAclPageStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNatAclPageStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNatAclPageStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNatAclPageStatusResponse setBody(DescribeNatAclPageStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNatAclPageStatusResponseBody getBody() {
        return this.body;
    }

}
