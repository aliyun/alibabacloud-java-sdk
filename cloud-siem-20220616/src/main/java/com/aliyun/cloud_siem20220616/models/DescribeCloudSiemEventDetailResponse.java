// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudSiemEventDetailResponseBody body;

    public static DescribeCloudSiemEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudSiemEventDetailResponse self = new DescribeCloudSiemEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudSiemEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudSiemEventDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudSiemEventDetailResponse setBody(DescribeCloudSiemEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudSiemEventDetailResponseBody getBody() {
        return this.body;
    }

}
