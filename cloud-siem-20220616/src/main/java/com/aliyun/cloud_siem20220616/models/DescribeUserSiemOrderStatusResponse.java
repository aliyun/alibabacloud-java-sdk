// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeUserSiemOrderStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserSiemOrderStatusResponseBody body;

    public static DescribeUserSiemOrderStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserSiemOrderStatusResponse self = new DescribeUserSiemOrderStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserSiemOrderStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserSiemOrderStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserSiemOrderStatusResponse setBody(DescribeUserSiemOrderStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserSiemOrderStatusResponseBody getBody() {
        return this.body;
    }

}
