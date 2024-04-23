// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteArtifactLifecycleRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteArtifactLifecycleRuleResponseBody body;

    public static DeleteArtifactLifecycleRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteArtifactLifecycleRuleResponse self = new DeleteArtifactLifecycleRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteArtifactLifecycleRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteArtifactLifecycleRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteArtifactLifecycleRuleResponse setBody(DeleteArtifactLifecycleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteArtifactLifecycleRuleResponseBody getBody() {
        return this.body;
    }

}
