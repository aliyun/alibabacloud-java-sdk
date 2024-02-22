// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertSourceResponseBody body;

    public static DescribeAlertSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSourceResponse self = new DescribeAlertSourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertSourceResponse setBody(DescribeAlertSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertSourceResponseBody getBody() {
        return this.body;
    }

}
