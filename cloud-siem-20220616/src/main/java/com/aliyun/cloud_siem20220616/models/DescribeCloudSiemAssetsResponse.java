// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemAssetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudSiemAssetsResponseBody body;

    public static DescribeCloudSiemAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudSiemAssetsResponse self = new DescribeCloudSiemAssetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudSiemAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudSiemAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudSiemAssetsResponse setBody(DescribeCloudSiemAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudSiemAssetsResponseBody getBody() {
        return this.body;
    }

}
