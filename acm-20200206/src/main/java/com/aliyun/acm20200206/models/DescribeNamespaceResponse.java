// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNamespaceResponseBody body;

    public static DescribeNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceResponse self = new DescribeNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNamespaceResponse setBody(DescribeNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNamespaceResponseBody getBody() {
        return this.body;
    }

}
