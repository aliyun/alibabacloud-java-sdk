// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortAutoCcStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePortAutoCcStatusResponseBody body;

    public static DescribePortAutoCcStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortAutoCcStatusResponse self = new DescribePortAutoCcStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortAutoCcStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortAutoCcStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePortAutoCcStatusResponse setBody(DescribePortAutoCcStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortAutoCcStatusResponseBody getBody() {
        return this.body;
    }

}
