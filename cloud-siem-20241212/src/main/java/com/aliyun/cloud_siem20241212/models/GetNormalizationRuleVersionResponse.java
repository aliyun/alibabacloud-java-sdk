// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetNormalizationRuleVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNormalizationRuleVersionResponseBody body;

    public static GetNormalizationRuleVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNormalizationRuleVersionResponse self = new GetNormalizationRuleVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetNormalizationRuleVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNormalizationRuleVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNormalizationRuleVersionResponse setBody(GetNormalizationRuleVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNormalizationRuleVersionResponseBody getBody() {
        return this.body;
    }

}
