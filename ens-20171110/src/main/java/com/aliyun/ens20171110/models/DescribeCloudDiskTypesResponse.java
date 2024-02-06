// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudDiskTypesResponseBody body;

    public static DescribeCloudDiskTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDiskTypesResponse self = new DescribeCloudDiskTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDiskTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudDiskTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudDiskTypesResponse setBody(DescribeCloudDiskTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudDiskTypesResponseBody getBody() {
        return this.body;
    }

}
