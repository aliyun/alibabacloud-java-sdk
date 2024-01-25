// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiGroupVpcWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiGroupVpcWhitelistResponseBody body;

    public static DescribeApiGroupVpcWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupVpcWhitelistResponse self = new DescribeApiGroupVpcWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupVpcWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiGroupVpcWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiGroupVpcWhitelistResponse setBody(DescribeApiGroupVpcWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiGroupVpcWhitelistResponseBody getBody() {
        return this.body;
    }

}
