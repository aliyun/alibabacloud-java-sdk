// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeMonitorGroupInstanceAttributeResponse setBody(DescribeMonitorGroupInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorGroupInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
