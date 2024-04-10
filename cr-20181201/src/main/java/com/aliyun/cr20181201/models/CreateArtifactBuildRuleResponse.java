// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactBuildRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateArtifactBuildRuleResponseBody body;

    public static CreateArtifactBuildRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactBuildRuleResponse self = new CreateArtifactBuildRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateArtifactBuildRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateArtifactBuildRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateArtifactBuildRuleResponse setBody(CreateArtifactBuildRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateArtifactBuildRuleResponseBody getBody() {
        return this.body;
    }

}
