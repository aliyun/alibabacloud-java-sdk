// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDrivePermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudDrivePermissionsResponseBody body;

    public static DescribeCloudDrivePermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDrivePermissionsResponse self = new DescribeCloudDrivePermissionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDrivePermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudDrivePermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudDrivePermissionsResponse setBody(DescribeCloudDrivePermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudDrivePermissionsResponseBody getBody() {
        return this.body;
    }

}
