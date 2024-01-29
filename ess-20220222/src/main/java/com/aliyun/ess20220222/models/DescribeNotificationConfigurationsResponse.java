// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeNotificationConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNotificationConfigurationsResponseBody body;

    public static DescribeNotificationConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotificationConfigurationsResponse self = new DescribeNotificationConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNotificationConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNotificationConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNotificationConfigurationsResponse setBody(DescribeNotificationConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNotificationConfigurationsResponseBody getBody() {
        return this.body;
    }

}
