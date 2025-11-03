// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskGroupDrivesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudDiskGroupDrivesResponseBody body;

    public static DescribeCloudDiskGroupDrivesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDiskGroupDrivesResponse self = new DescribeCloudDiskGroupDrivesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDiskGroupDrivesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudDiskGroupDrivesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudDiskGroupDrivesResponse setBody(DescribeCloudDiskGroupDrivesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudDiskGroupDrivesResponseBody getBody() {
        return this.body;
    }

}
