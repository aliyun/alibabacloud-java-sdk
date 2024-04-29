// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAutoCcListCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAutoCcListCountResponseBody body;

    public static DescribeAutoCcListCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoCcListCountResponse self = new DescribeAutoCcListCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoCcListCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoCcListCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoCcListCountResponse setBody(DescribeAutoCcListCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoCcListCountResponseBody getBody() {
        return this.body;
    }

}
