// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeAlarmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAlarmsResponseBody body;

    public static DescribeAlarmsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmsResponse self = new DescribeAlarmsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlarmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlarmsResponse setBody(DescribeAlarmsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlarmsResponseBody getBody() {
        return this.body;
    }

}
