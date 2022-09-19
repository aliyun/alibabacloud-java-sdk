// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeProcessInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProcessInstanceAttributeResponseBody body;

    public static DescribeProcessInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessInstanceAttributeResponse self = new DescribeProcessInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProcessInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProcessInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProcessInstanceAttributeResponse setBody(DescribeProcessInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProcessInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
