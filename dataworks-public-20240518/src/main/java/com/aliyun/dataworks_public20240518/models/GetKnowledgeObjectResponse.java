// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetKnowledgeObjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKnowledgeObjectResponseBody body;

    public static GetKnowledgeObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeObjectResponse self = new GetKnowledgeObjectResponse();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKnowledgeObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKnowledgeObjectResponse setBody(GetKnowledgeObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKnowledgeObjectResponseBody getBody() {
        return this.body;
    }

}
