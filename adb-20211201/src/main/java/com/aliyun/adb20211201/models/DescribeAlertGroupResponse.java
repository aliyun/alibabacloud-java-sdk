// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAlertGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAlertGroupResponseBody body;

    public static DescribeAlertGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertGroupResponse self = new DescribeAlertGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertGroupResponse setBody(DescribeAlertGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertGroupResponseBody getBody() {
        return this.body;
    }

}
