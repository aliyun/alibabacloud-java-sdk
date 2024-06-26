// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeCloudServiceTypeStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudServiceTypeStatusResponseBody body;

    public static DescribeCloudServiceTypeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudServiceTypeStatusResponse self = new DescribeCloudServiceTypeStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudServiceTypeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudServiceTypeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudServiceTypeStatusResponse setBody(DescribeCloudServiceTypeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudServiceTypeStatusResponseBody getBody() {
        return this.body;
    }

}
