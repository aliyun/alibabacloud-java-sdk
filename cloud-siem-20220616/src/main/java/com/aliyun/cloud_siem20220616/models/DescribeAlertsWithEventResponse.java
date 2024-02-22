// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertsWithEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertsWithEventResponseBody body;

    public static DescribeAlertsWithEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertsWithEventResponse self = new DescribeAlertsWithEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertsWithEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertsWithEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertsWithEventResponse setBody(DescribeAlertsWithEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertsWithEventResponseBody getBody() {
        return this.body;
    }

}
