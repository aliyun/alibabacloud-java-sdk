// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeProcessDefinitionAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProcessDefinitionAttributeResponseBody body;

    public static DescribeProcessDefinitionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessDefinitionAttributeResponse self = new DescribeProcessDefinitionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProcessDefinitionAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProcessDefinitionAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProcessDefinitionAttributeResponse setBody(DescribeProcessDefinitionAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProcessDefinitionAttributeResponseBody getBody() {
        return this.body;
    }

}
