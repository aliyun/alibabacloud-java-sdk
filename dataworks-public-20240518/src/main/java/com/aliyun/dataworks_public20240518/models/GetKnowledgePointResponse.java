// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetKnowledgePointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKnowledgePointResponseBody body;

    public static GetKnowledgePointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgePointResponse self = new GetKnowledgePointResponse();
        return TeaModel.build(map, self);
    }

    public GetKnowledgePointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKnowledgePointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKnowledgePointResponse setBody(GetKnowledgePointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKnowledgePointResponseBody getBody() {
        return this.body;
    }

}
