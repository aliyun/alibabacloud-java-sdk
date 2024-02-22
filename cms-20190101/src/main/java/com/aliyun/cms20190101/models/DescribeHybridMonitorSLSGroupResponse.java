// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorSLSGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridMonitorSLSGroupResponseBody body;

    public static DescribeHybridMonitorSLSGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridMonitorSLSGroupResponse self = new DescribeHybridMonitorSLSGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridMonitorSLSGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridMonitorSLSGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridMonitorSLSGroupResponse setBody(DescribeHybridMonitorSLSGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridMonitorSLSGroupResponseBody getBody() {
        return this.body;
    }

}
