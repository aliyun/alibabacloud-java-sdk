// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeFailedNotificationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFailedNotificationsResponseBody body;

    public static DescribeFailedNotificationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFailedNotificationsResponse self = new DescribeFailedNotificationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFailedNotificationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFailedNotificationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFailedNotificationsResponse setBody(DescribeFailedNotificationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFailedNotificationsResponseBody getBody() {
        return this.body;
    }

}
