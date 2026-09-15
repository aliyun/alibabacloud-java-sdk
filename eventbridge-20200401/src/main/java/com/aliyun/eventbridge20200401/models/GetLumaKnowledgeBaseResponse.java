// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetLumaKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLumaKnowledgeBaseResponseBody body;

    public static GetLumaKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLumaKnowledgeBaseResponse self = new GetLumaKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public GetLumaKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLumaKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLumaKnowledgeBaseResponse setBody(GetLumaKnowledgeBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLumaKnowledgeBaseResponseBody getBody() {
        return this.body;
    }

}
