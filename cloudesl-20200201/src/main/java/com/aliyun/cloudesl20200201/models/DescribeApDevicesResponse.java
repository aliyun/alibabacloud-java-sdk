// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeApDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApDevicesResponseBody body;

    public static DescribeApDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApDevicesResponse self = new DescribeApDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApDevicesResponse setBody(DescribeApDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApDevicesResponseBody getBody() {
        return this.body;
    }

}
