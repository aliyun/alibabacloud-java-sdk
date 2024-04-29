// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAutoCcWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAutoCcWhitelistResponseBody body;

    public static DescribeAutoCcWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoCcWhitelistResponse self = new DescribeAutoCcWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoCcWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoCcWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoCcWhitelistResponse setBody(DescribeAutoCcWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoCcWhitelistResponseBody getBody() {
        return this.body;
    }

}
