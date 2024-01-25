// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAllAlertContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAllAlertContactResponseBody body;

    public static DescribeAllAlertContactResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllAlertContactResponse self = new DescribeAllAlertContactResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllAlertContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllAlertContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAllAlertContactResponse setBody(DescribeAllAlertContactResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllAlertContactResponseBody getBody() {
        return this.body;
    }

}
