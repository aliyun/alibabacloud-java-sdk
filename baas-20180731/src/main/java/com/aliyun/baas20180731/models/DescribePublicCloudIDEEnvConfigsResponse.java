// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribePublicCloudIDEEnvConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePublicCloudIDEEnvConfigsResponseBody body;

    public static DescribePublicCloudIDEEnvConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePublicCloudIDEEnvConfigsResponse self = new DescribePublicCloudIDEEnvConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePublicCloudIDEEnvConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePublicCloudIDEEnvConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePublicCloudIDEEnvConfigsResponse setBody(DescribePublicCloudIDEEnvConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePublicCloudIDEEnvConfigsResponseBody getBody() {
        return this.body;
    }

}
