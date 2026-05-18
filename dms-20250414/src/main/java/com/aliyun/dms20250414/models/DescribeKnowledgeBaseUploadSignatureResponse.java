// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseUploadSignatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKnowledgeBaseUploadSignatureResponseBody body;

    public static DescribeKnowledgeBaseUploadSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseUploadSignatureResponse self = new DescribeKnowledgeBaseUploadSignatureResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseUploadSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKnowledgeBaseUploadSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKnowledgeBaseUploadSignatureResponse setBody(DescribeKnowledgeBaseUploadSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKnowledgeBaseUploadSignatureResponseBody getBody() {
        return this.body;
    }

}
