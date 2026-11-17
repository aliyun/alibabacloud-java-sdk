// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetKnowledgeSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKnowledgeSourceResponseBody body;

    public static GetKnowledgeSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeSourceResponse self = new GetKnowledgeSourceResponse();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKnowledgeSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKnowledgeSourceResponse setBody(GetKnowledgeSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKnowledgeSourceResponseBody getBody() {
        return this.body;
    }

}
