// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactLifecycleRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateArtifactLifecycleRuleResponseBody body;

    public static CreateArtifactLifecycleRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactLifecycleRuleResponse self = new CreateArtifactLifecycleRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateArtifactLifecycleRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateArtifactLifecycleRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateArtifactLifecycleRuleResponse setBody(CreateArtifactLifecycleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateArtifactLifecycleRuleResponseBody getBody() {
        return this.body;
    }

}
