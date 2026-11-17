// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseBuildTaskInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKnowledgeBaseBuildTaskInstanceResponseBody body;

    public static GetKnowledgeBaseBuildTaskInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseBuildTaskInstanceResponse self = new GetKnowledgeBaseBuildTaskInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseBuildTaskInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKnowledgeBaseBuildTaskInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKnowledgeBaseBuildTaskInstanceResponse setBody(GetKnowledgeBaseBuildTaskInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKnowledgeBaseBuildTaskInstanceResponseBody getBody() {
        return this.body;
    }

}
