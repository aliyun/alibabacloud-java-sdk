// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeCloudServiceOrganizationStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudServiceOrganizationStatusResponseBody body;

    public static DescribeCloudServiceOrganizationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudServiceOrganizationStatusResponse self = new DescribeCloudServiceOrganizationStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudServiceOrganizationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudServiceOrganizationStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudServiceOrganizationStatusResponse setBody(DescribeCloudServiceOrganizationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudServiceOrganizationStatusResponseBody getBody() {
        return this.body;
    }

}
