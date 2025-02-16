// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeRatePlanInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRatePlanInstanceStatusResponseBody body;

    public static DescribeRatePlanInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRatePlanInstanceStatusResponse self = new DescribeRatePlanInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRatePlanInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRatePlanInstanceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRatePlanInstanceStatusResponse setBody(DescribeRatePlanInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRatePlanInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
