// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksFullStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDisksFullStatusResponseBody body;

    public static DescribeDisksFullStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksFullStatusResponse self = new DescribeDisksFullStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDisksFullStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDisksFullStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDisksFullStatusResponse setBody(DescribeDisksFullStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDisksFullStatusResponseBody getBody() {
        return this.body;
    }

}
