// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserIPSWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserIPSWhitelistResponseBody body;

    public static DescribeUserIPSWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserIPSWhitelistResponse self = new DescribeUserIPSWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserIPSWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserIPSWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserIPSWhitelistResponse setBody(DescribeUserIPSWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserIPSWhitelistResponseBody getBody() {
        return this.body;
    }

}
