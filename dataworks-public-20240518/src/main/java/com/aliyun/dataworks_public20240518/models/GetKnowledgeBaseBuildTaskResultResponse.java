// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseBuildTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKnowledgeBaseBuildTaskResultResponseBody body;

    public static GetKnowledgeBaseBuildTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseBuildTaskResultResponse self = new GetKnowledgeBaseBuildTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseBuildTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKnowledgeBaseBuildTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKnowledgeBaseBuildTaskResultResponse setBody(GetKnowledgeBaseBuildTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKnowledgeBaseBuildTaskResultResponseBody getBody() {
        return this.body;
    }

}
