// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListArtifactLifecycleRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListArtifactLifecycleRuleResponseBody body;

    public static ListArtifactLifecycleRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactLifecycleRuleResponse self = new ListArtifactLifecycleRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListArtifactLifecycleRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListArtifactLifecycleRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListArtifactLifecycleRuleResponse setBody(ListArtifactLifecycleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListArtifactLifecycleRuleResponseBody getBody() {
        return this.body;
    }

}
