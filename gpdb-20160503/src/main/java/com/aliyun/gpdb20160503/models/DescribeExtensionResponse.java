// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeExtensionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExtensionResponseBody body;

    public static DescribeExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExtensionResponse self = new DescribeExtensionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExtensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExtensionResponse setBody(DescribeExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExtensionResponseBody getBody() {
        return this.body;
    }

}
