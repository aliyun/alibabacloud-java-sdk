// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactBuildRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetArtifactBuildRuleResponseBody body;

    public static GetArtifactBuildRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactBuildRuleResponse self = new GetArtifactBuildRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetArtifactBuildRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArtifactBuildRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetArtifactBuildRuleResponse setBody(GetArtifactBuildRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArtifactBuildRuleResponseBody getBody() {
        return this.body;
    }

}
