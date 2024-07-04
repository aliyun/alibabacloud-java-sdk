// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeAlertConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertConfigurationResponseBody body;

    public static DescribeAlertConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertConfigurationResponse self = new DescribeAlertConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertConfigurationResponse setBody(DescribeAlertConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertConfigurationResponseBody getBody() {
        return this.body;
    }

}
