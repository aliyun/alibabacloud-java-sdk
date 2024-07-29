// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProjectMessagesResponseBody body;

    public static DescribeProjectMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectMessagesResponse self = new DescribeProjectMessagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProjectMessagesResponse setBody(DescribeProjectMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectMessagesResponseBody getBody() {
        return this.body;
    }

}
