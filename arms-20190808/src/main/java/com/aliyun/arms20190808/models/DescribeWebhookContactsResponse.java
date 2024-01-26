// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeWebhookContactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebhookContactsResponseBody body;

    public static DescribeWebhookContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebhookContactsResponse self = new DescribeWebhookContactsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebhookContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebhookContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebhookContactsResponse setBody(DescribeWebhookContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebhookContactsResponseBody getBody() {
        return this.body;
    }

}
