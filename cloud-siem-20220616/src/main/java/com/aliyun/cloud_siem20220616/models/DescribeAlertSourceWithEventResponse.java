// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertSourceWithEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertSourceWithEventResponseBody body;

    public static DescribeAlertSourceWithEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSourceWithEventResponse self = new DescribeAlertSourceWithEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSourceWithEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertSourceWithEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertSourceWithEventResponse setBody(DescribeAlertSourceWithEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertSourceWithEventResponseBody getBody() {
        return this.body;
    }

}
