// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDriveUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudDriveUsersResponseBody body;

    public static DescribeCloudDriveUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDriveUsersResponse self = new DescribeCloudDriveUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDriveUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudDriveUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudDriveUsersResponse setBody(DescribeCloudDriveUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudDriveUsersResponseBody getBody() {
        return this.body;
    }

}
