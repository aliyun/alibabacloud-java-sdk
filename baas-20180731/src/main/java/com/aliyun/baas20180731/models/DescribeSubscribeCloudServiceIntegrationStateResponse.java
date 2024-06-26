// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSubscribeCloudServiceIntegrationStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSubscribeCloudServiceIntegrationStateResponseBody body;

    public static DescribeSubscribeCloudServiceIntegrationStateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscribeCloudServiceIntegrationStateResponse self = new DescribeSubscribeCloudServiceIntegrationStateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubscribeCloudServiceIntegrationStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubscribeCloudServiceIntegrationStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSubscribeCloudServiceIntegrationStateResponse setBody(DescribeSubscribeCloudServiceIntegrationStateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubscribeCloudServiceIntegrationStateResponseBody getBody() {
        return this.body;
    }

}
