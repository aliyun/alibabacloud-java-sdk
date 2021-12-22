// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCloudDiskTypesResponse setBody(DescribeCloudDiskTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudDiskTypesResponseBody getBody() {
        return this.body;
    }

}
