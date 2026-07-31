// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetKnowledgeRecallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKnowledgeRecallResponseBody body;

    public static GetKnowledgeRecallResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeRecallResponse self = new GetKnowledgeRecallResponse();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeRecallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKnowledgeRecallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKnowledgeRecallResponse setBody(GetKnowledgeRecallResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKnowledgeRecallResponseBody getBody() {
        return this.body;
    }

}
