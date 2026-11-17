// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopKnowledgeBaseBuildTaskInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopKnowledgeBaseBuildTaskInstanceResponseBody body;

    public static StopKnowledgeBaseBuildTaskInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopKnowledgeBaseBuildTaskInstanceResponse self = new StopKnowledgeBaseBuildTaskInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopKnowledgeBaseBuildTaskInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopKnowledgeBaseBuildTaskInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopKnowledgeBaseBuildTaskInstanceResponse setBody(StopKnowledgeBaseBuildTaskInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopKnowledgeBaseBuildTaskInstanceResponseBody getBody() {
        return this.body;
    }

}
