// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAlertInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAlertInstanceResponseBody body;

    public static DescribeAlertInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertInstanceResponse self = new DescribeAlertInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertInstanceResponse setBody(DescribeAlertInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertInstanceResponseBody getBody() {
        return this.body;
    }

}
