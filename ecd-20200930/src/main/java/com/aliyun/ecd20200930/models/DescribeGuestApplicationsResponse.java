// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGuestApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGuestApplicationsResponseBody body;

    public static DescribeGuestApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGuestApplicationsResponse self = new DescribeGuestApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGuestApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGuestApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGuestApplicationsResponse setBody(DescribeGuestApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGuestApplicationsResponseBody getBody() {
        return this.body;
    }

}
