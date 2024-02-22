// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMonitorGroupInstanceAttributeResponseBody body;

    public static DescribeMonitorGroupInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupInstanceAttributeResponse self = new DescribeMonitorGroupInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitorGroupInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMonitorGroupInstanceAttributeResponse setBody(DescribeMonitorGroupInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorGroupInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
