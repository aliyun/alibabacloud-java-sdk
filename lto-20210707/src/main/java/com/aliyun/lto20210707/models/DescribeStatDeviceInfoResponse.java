// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeStatDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStatDeviceInfoResponseBody body;

    public static DescribeStatDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatDeviceInfoResponse self = new DescribeStatDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStatDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStatDeviceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStatDeviceInfoResponse setBody(DescribeStatDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStatDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
