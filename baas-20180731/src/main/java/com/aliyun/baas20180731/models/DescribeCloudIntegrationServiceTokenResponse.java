// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeCloudIntegrationServiceTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudIntegrationServiceTokenResponseBody body;

    public static DescribeCloudIntegrationServiceTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudIntegrationServiceTokenResponse self = new DescribeCloudIntegrationServiceTokenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudIntegrationServiceTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudIntegrationServiceTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudIntegrationServiceTokenResponse setBody(DescribeCloudIntegrationServiceTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudIntegrationServiceTokenResponseBody getBody() {
        return this.body;
    }

}
