// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDeprecatedTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDeprecatedTemplateResponseBody body;

    public static DescribeDeprecatedTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeprecatedTemplateResponse self = new DescribeDeprecatedTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeprecatedTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeprecatedTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeprecatedTemplateResponse setBody(DescribeDeprecatedTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeprecatedTemplateResponseBody getBody() {
        return this.body;
    }

}
