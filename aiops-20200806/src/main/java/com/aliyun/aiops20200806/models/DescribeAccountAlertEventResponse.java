// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAccountAlertEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccountAlertEventResponseBody body;

    public static DescribeAccountAlertEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAlertEventResponse self = new DescribeAccountAlertEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAlertEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountAlertEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountAlertEventResponse setBody(DescribeAccountAlertEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountAlertEventResponseBody getBody() {
        return this.body;
    }

}
