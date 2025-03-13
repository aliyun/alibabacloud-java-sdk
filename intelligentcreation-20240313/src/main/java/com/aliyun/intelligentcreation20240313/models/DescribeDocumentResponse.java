// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class DescribeDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DocumentResult body;

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

    public DescribeDocumentResponse setBody(DocumentResult body) {
        this.body = body;
        return this;
    }
    public DocumentResult getBody() {
        return this.body;
    }

}
