// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepoBuildRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRepoBuildRuleResponseBody body;

    public static UpdateRepoBuildRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepoBuildRuleResponse self = new UpdateRepoBuildRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRepoBuildRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRepoBuildRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRepoBuildRuleResponse setBody(UpdateRepoBuildRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRepoBuildRuleResponseBody getBody() {
        return this.body;
    }

}
