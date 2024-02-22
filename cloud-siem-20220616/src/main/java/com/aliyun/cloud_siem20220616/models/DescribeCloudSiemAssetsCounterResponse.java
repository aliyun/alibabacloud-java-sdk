// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemAssetsCounterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudSiemAssetsCounterResponseBody body;

    public static DescribeCloudSiemAssetsCounterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudSiemAssetsCounterResponse self = new DescribeCloudSiemAssetsCounterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudSiemAssetsCounterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudSiemAssetsCounterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudSiemAssetsCounterResponse setBody(DescribeCloudSiemAssetsCounterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudSiemAssetsCounterResponseBody getBody() {
        return this.body;
    }

}
