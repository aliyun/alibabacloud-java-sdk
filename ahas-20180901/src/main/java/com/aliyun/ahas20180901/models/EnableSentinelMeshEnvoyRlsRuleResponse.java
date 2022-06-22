// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class EnableSentinelMeshEnvoyRlsRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableSentinelMeshEnvoyRlsRuleResponseBody body;

    public static EnableSentinelMeshEnvoyRlsRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSentinelMeshEnvoyRlsRuleResponse self = new EnableSentinelMeshEnvoyRlsRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableSentinelMeshEnvoyRlsRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSentinelMeshEnvoyRlsRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSentinelMeshEnvoyRlsRuleResponse setBody(EnableSentinelMeshEnvoyRlsRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSentinelMeshEnvoyRlsRuleResponseBody getBody() {
        return this.body;
    }

}
