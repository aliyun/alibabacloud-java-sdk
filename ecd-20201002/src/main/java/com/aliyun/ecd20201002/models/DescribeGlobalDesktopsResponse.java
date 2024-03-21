// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeGlobalDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGlobalDesktopsResponseBody body;

    public static DescribeGlobalDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDesktopsResponse self = new DescribeGlobalDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGlobalDesktopsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGlobalDesktopsResponse setBody(DescribeGlobalDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGlobalDesktopsResponseBody getBody() {
        return this.body;
    }

}
