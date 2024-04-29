// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAutoCcBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAutoCcBlacklistResponseBody body;

    public static DescribeAutoCcBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoCcBlacklistResponse self = new DescribeAutoCcBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoCcBlacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoCcBlacklistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoCcBlacklistResponse setBody(DescribeAutoCcBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoCcBlacklistResponseBody getBody() {
        return this.body;
    }

}
