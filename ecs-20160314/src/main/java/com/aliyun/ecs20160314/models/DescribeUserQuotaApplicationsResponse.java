// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeUserQuotaApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserQuotaApplicationsResponseBody body;

    public static DescribeUserQuotaApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserQuotaApplicationsResponse self = new DescribeUserQuotaApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserQuotaApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserQuotaApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserQuotaApplicationsResponse setBody(DescribeUserQuotaApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserQuotaApplicationsResponseBody getBody() {
        return this.body;
    }

}
