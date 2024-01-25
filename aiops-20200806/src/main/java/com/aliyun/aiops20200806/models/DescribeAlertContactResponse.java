// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertContactResponseBody body;

    public static DescribeAlertContactResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertContactResponse self = new DescribeAlertContactResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertContactResponse setBody(DescribeAlertContactResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertContactResponseBody getBody() {
        return this.body;
    }

}
