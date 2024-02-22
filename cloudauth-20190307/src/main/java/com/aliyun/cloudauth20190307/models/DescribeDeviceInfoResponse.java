// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDeviceInfoResponseBody body;

    public static DescribeDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceInfoResponse self = new DescribeDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeviceInfoResponse setBody(DescribeDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
