// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseBuildTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKnowledgeBaseBuildTaskResponseBody body;

    public static GetKnowledgeBaseBuildTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseBuildTaskResponse self = new GetKnowledgeBaseBuildTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseBuildTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKnowledgeBaseBuildTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKnowledgeBaseBuildTaskResponse setBody(GetKnowledgeBaseBuildTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKnowledgeBaseBuildTaskResponseBody getBody() {
        return this.body;
    }

}
