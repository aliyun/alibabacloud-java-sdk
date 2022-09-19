// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeProcessDefinitionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProcessDefinitionsResponseBody body;

    public static DescribeProcessDefinitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessDefinitionsResponse self = new DescribeProcessDefinitionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProcessDefinitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProcessDefinitionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProcessDefinitionsResponse setBody(DescribeProcessDefinitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProcessDefinitionsResponseBody getBody() {
        return this.body;
    }

}
