// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAlertContactResponse setBody(DescribeAlertContactResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertContactResponseBody getBody() {
        return this.body;
    }

}
