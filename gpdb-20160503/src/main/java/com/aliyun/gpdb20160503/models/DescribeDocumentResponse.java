// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDocumentResponseBody body;

    public static DescribeDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocumentResponse self = new DescribeDocumentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDocumentResponse setBody(DescribeDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDocumentResponseBody getBody() {
        return this.body;
    }

}
