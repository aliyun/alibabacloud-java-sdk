// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeAccountLimitsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccountLimitsResponseBody body;

    public static DescribeAccountLimitsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountLimitsResponse self = new DescribeAccountLimitsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountLimitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountLimitsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountLimitsResponse setBody(DescribeAccountLimitsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountLimitsResponseBody getBody() {
        return this.body;
    }

}
