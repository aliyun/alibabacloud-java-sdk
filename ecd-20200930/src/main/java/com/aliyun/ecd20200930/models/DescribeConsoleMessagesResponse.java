// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeConsoleMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConsoleMessagesResponseBody body;

    public static DescribeConsoleMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsoleMessagesResponse self = new DescribeConsoleMessagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConsoleMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConsoleMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConsoleMessagesResponse setBody(DescribeConsoleMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsoleMessagesResponseBody getBody() {
        return this.body;
    }

}
