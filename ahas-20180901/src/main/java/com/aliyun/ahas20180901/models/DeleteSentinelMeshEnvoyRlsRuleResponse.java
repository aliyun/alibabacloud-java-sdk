// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteSentinelMeshEnvoyRlsRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSentinelMeshEnvoyRlsRuleResponseBody body;

    public static DeleteSentinelMeshEnvoyRlsRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSentinelMeshEnvoyRlsRuleResponse self = new DeleteSentinelMeshEnvoyRlsRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSentinelMeshEnvoyRlsRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSentinelMeshEnvoyRlsRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSentinelMeshEnvoyRlsRuleResponse setBody(DeleteSentinelMeshEnvoyRlsRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSentinelMeshEnvoyRlsRuleResponseBody getBody() {
        return this.body;
    }

}
