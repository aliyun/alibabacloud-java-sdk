// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RetryKnowledgeBaseBuildTaskInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryKnowledgeBaseBuildTaskInstanceResponseBody body;

    public static RetryKnowledgeBaseBuildTaskInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryKnowledgeBaseBuildTaskInstanceResponse self = new RetryKnowledgeBaseBuildTaskInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RetryKnowledgeBaseBuildTaskInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryKnowledgeBaseBuildTaskInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryKnowledgeBaseBuildTaskInstanceResponse setBody(RetryKnowledgeBaseBuildTaskInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryKnowledgeBaseBuildTaskInstanceResponseBody getBody() {
        return this.body;
    }

}
