// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskAvailableResourceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudDiskAvailableResourceInfoResponseBody body;

    public static DescribeCloudDiskAvailableResourceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDiskAvailableResourceInfoResponse self = new DescribeCloudDiskAvailableResourceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDiskAvailableResourceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudDiskAvailableResourceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudDiskAvailableResourceInfoResponse setBody(DescribeCloudDiskAvailableResourceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudDiskAvailableResourceInfoResponseBody getBody() {
        return this.body;
    }

}
