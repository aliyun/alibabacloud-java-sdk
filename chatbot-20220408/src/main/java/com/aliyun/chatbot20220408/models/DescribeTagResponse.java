// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTagResponseBody body;

    public static DescribeTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagResponse self = new DescribeTagResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTagResponse setBody(DescribeTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagResponseBody getBody() {
        return this.body;
    }

}
