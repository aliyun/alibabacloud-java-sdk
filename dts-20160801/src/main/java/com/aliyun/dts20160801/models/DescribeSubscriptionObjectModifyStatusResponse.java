// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionObjectModifyStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSubscriptionObjectModifyStatusResponseBody body;

    public static DescribeSubscriptionObjectModifyStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionObjectModifyStatusResponse self = new DescribeSubscriptionObjectModifyStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionObjectModifyStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubscriptionObjectModifyStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSubscriptionObjectModifyStatusResponse setBody(DescribeSubscriptionObjectModifyStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubscriptionObjectModifyStatusResponseBody getBody() {
        return this.body;
    }

}
