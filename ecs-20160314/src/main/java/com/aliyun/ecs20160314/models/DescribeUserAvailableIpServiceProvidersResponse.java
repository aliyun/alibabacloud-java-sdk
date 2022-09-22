// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeUserAvailableIpServiceProvidersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserAvailableIpServiceProvidersResponseBody body;

    public static DescribeUserAvailableIpServiceProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAvailableIpServiceProvidersResponse self = new DescribeUserAvailableIpServiceProvidersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserAvailableIpServiceProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserAvailableIpServiceProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserAvailableIpServiceProvidersResponse setBody(DescribeUserAvailableIpServiceProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserAvailableIpServiceProvidersResponseBody getBody() {
        return this.body;
    }

}
