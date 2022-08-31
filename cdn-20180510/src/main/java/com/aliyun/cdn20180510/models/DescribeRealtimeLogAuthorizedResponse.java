// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRealtimeLogAuthorizedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRealtimeLogAuthorizedResponseBody body;

    public static DescribeRealtimeLogAuthorizedResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRealtimeLogAuthorizedResponse self = new DescribeRealtimeLogAuthorizedResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRealtimeLogAuthorizedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRealtimeLogAuthorizedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRealtimeLogAuthorizedResponse setBody(DescribeRealtimeLogAuthorizedResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRealtimeLogAuthorizedResponseBody getBody() {
        return this.body;
    }

}
