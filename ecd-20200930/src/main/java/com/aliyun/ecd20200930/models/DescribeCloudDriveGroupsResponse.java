// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDriveGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudDriveGroupsResponseBody body;

    public static DescribeCloudDriveGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDriveGroupsResponse self = new DescribeCloudDriveGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDriveGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudDriveGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudDriveGroupsResponse setBody(DescribeCloudDriveGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudDriveGroupsResponseBody getBody() {
        return this.body;
    }

}
