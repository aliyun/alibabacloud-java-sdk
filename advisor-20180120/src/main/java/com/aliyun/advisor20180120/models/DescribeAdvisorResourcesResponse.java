// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvisorResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAdvisorResourcesResponseBody body;

    public static DescribeAdvisorResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvisorResourcesResponse self = new DescribeAdvisorResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdvisorResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdvisorResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdvisorResourcesResponse setBody(DescribeAdvisorResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdvisorResourcesResponseBody getBody() {
        return this.body;
    }

}
