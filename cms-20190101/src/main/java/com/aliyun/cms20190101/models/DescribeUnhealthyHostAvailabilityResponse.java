// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeUnhealthyHostAvailabilityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUnhealthyHostAvailabilityResponseBody body;

    public static DescribeUnhealthyHostAvailabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnhealthyHostAvailabilityResponse self = new DescribeUnhealthyHostAvailabilityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUnhealthyHostAvailabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUnhealthyHostAvailabilityResponse setBody(DescribeUnhealthyHostAvailabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUnhealthyHostAvailabilityResponseBody getBody() {
        return this.body;
    }

}
