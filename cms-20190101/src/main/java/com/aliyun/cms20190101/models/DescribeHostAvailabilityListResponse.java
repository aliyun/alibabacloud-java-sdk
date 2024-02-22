// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHostAvailabilityListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHostAvailabilityListResponseBody body;

    public static DescribeHostAvailabilityListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostAvailabilityListResponse self = new DescribeHostAvailabilityListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHostAvailabilityListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHostAvailabilityListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHostAvailabilityListResponse setBody(DescribeHostAvailabilityListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHostAvailabilityListResponseBody getBody() {
        return this.body;
    }

}
