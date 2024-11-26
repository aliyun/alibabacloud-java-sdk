// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeOrderForIsvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrderForIsvResponseBody body;

    public static DescribeOrderForIsvResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrderForIsvResponse self = new DescribeOrderForIsvResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrderForIsvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrderForIsvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrderForIsvResponse setBody(DescribeOrderForIsvResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrderForIsvResponseBody getBody() {
        return this.body;
    }

}
