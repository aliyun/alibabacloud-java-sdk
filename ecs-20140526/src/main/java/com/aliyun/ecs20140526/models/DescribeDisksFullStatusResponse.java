// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksFullStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDisksFullStatusResponse setBody(DescribeDisksFullStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDisksFullStatusResponseBody getBody() {
        return this.body;
    }

}
