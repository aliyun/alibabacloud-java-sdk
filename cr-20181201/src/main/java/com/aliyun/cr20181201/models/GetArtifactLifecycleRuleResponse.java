// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactLifecycleRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetArtifactLifecycleRuleResponseBody body;

    public static GetArtifactLifecycleRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactLifecycleRuleResponse self = new GetArtifactLifecycleRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetArtifactLifecycleRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArtifactLifecycleRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetArtifactLifecycleRuleResponse setBody(GetArtifactLifecycleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArtifactLifecycleRuleResponseBody getBody() {
        return this.body;
    }

}
