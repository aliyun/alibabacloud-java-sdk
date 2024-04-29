// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeBlackholeStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBlackholeStatusResponseBody body;

    public static DescribeBlackholeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlackholeStatusResponse self = new DescribeBlackholeStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlackholeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlackholeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBlackholeStatusResponse setBody(DescribeBlackholeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlackholeStatusResponseBody getBody() {
        return this.body;
    }

}
