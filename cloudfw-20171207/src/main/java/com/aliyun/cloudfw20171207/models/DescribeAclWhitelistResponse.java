// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAclWhitelistResponseBody body;

    public static DescribeAclWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclWhitelistResponse self = new DescribeAclWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAclWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAclWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAclWhitelistResponse setBody(DescribeAclWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAclWhitelistResponseBody getBody() {
        return this.body;
    }

}
