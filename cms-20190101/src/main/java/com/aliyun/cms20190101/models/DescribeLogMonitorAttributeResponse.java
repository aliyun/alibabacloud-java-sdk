// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeLogMonitorAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogMonitorAttributeResponseBody body;

    public static DescribeLogMonitorAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogMonitorAttributeResponse self = new DescribeLogMonitorAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogMonitorAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogMonitorAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogMonitorAttributeResponse setBody(DescribeLogMonitorAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogMonitorAttributeResponseBody getBody() {
        return this.body;
    }

}
