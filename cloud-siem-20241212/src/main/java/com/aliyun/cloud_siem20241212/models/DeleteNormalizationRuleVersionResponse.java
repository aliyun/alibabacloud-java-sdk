// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteNormalizationRuleVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNormalizationRuleVersionResponseBody body;

    public static DeleteNormalizationRuleVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNormalizationRuleVersionResponse self = new DeleteNormalizationRuleVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNormalizationRuleVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNormalizationRuleVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNormalizationRuleVersionResponse setBody(DeleteNormalizationRuleVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNormalizationRuleVersionResponseBody getBody() {
        return this.body;
    }

}
