// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserAlarmConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserAlarmConfigResponseBody body;

    public static DescribeUserAlarmConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAlarmConfigResponse self = new DescribeUserAlarmConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserAlarmConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserAlarmConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserAlarmConfigResponse setBody(DescribeUserAlarmConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserAlarmConfigResponseBody getBody() {
        return this.body;
    }

}
