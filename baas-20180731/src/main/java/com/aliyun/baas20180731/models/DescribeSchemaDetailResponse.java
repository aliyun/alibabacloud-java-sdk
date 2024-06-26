// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSchemaDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSchemaDetailResponseBody body;

    public static DescribeSchemaDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSchemaDetailResponse self = new DescribeSchemaDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSchemaDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSchemaDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSchemaDetailResponse setBody(DescribeSchemaDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSchemaDetailResponseBody getBody() {
        return this.body;
    }

}
