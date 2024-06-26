// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMyBlockchainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMyBlockchainsResponseBody body;

    public static DescribeMyBlockchainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMyBlockchainsResponse self = new DescribeMyBlockchainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMyBlockchainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMyBlockchainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMyBlockchainsResponse setBody(DescribeMyBlockchainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMyBlockchainsResponseBody getBody() {
        return this.body;
    }

}
