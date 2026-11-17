// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseBuildTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKnowledgeBaseBuildTaskResponseBody body;

    public static UpdateKnowledgeBaseBuildTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseBuildTaskResponse self = new UpdateKnowledgeBaseBuildTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseBuildTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKnowledgeBaseBuildTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKnowledgeBaseBuildTaskResponse setBody(UpdateKnowledgeBaseBuildTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKnowledgeBaseBuildTaskResponseBody getBody() {
        return this.body;
    }

}
