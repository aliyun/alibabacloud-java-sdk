// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertEventResponseBody body;

    public static DescribeAlertEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertEventResponse self = new DescribeAlertEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertEventResponse setBody(DescribeAlertEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertEventResponseBody getBody() {
        return this.body;
    }

}
