// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DisableSentinelMeshEnvoyRlsRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableSentinelMeshEnvoyRlsRuleResponseBody body;

    public static DisableSentinelMeshEnvoyRlsRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSentinelMeshEnvoyRlsRuleResponse self = new DisableSentinelMeshEnvoyRlsRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableSentinelMeshEnvoyRlsRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSentinelMeshEnvoyRlsRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableSentinelMeshEnvoyRlsRuleResponse setBody(DisableSentinelMeshEnvoyRlsRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSentinelMeshEnvoyRlsRuleResponseBody getBody() {
        return this.body;
    }

}
