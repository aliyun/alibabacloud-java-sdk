// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSubscriptionInstanceStatusResponseBody body;

    public static DescribeSubscriptionInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionInstanceStatusResponse self = new DescribeSubscriptionInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubscriptionInstanceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSubscriptionInstanceStatusResponse setBody(DescribeSubscriptionInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubscriptionInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
