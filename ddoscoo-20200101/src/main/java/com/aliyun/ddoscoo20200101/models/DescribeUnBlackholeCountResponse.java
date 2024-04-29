// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeUnBlackholeCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUnBlackholeCountResponseBody body;

    public static DescribeUnBlackholeCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnBlackholeCountResponse self = new DescribeUnBlackholeCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUnBlackholeCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUnBlackholeCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUnBlackholeCountResponse setBody(DescribeUnBlackholeCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUnBlackholeCountResponseBody getBody() {
        return this.body;
    }

}
