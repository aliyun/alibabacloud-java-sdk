// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateArtifactLifecycleRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateArtifactLifecycleRuleResponseBody body;

    public static UpdateArtifactLifecycleRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateArtifactLifecycleRuleResponse self = new UpdateArtifactLifecycleRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateArtifactLifecycleRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateArtifactLifecycleRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateArtifactLifecycleRuleResponse setBody(UpdateArtifactLifecycleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateArtifactLifecycleRuleResponseBody getBody() {
        return this.body;
    }

}
