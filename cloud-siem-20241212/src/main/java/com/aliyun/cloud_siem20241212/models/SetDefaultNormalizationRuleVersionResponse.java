// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class SetDefaultNormalizationRuleVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDefaultNormalizationRuleVersionResponseBody body;

    public static SetDefaultNormalizationRuleVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultNormalizationRuleVersionResponse self = new SetDefaultNormalizationRuleVersionResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultNormalizationRuleVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDefaultNormalizationRuleVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDefaultNormalizationRuleVersionResponse setBody(SetDefaultNormalizationRuleVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultNormalizationRuleVersionResponseBody getBody() {
        return this.body;
    }

}
