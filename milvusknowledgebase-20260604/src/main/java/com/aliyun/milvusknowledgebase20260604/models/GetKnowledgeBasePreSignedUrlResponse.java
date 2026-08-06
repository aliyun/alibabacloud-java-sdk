// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvusknowledgebase20260604.models;

import com.aliyun.tea.*;

public class GetKnowledgeBasePreSignedUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKnowledgeBasePreSignedUrlResponseBody body;

    public static GetKnowledgeBasePreSignedUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBasePreSignedUrlResponse self = new GetKnowledgeBasePreSignedUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBasePreSignedUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKnowledgeBasePreSignedUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKnowledgeBasePreSignedUrlResponse setBody(GetKnowledgeBasePreSignedUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKnowledgeBasePreSignedUrlResponseBody getBody() {
        return this.body;
    }

}
