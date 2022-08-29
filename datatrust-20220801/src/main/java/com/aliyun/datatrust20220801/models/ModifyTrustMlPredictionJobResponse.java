// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ModifyTrustMlPredictionJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTrustMlPredictionJobResponseBody body;

    public static ModifyTrustMlPredictionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrustMlPredictionJobResponse self = new ModifyTrustMlPredictionJobResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTrustMlPredictionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTrustMlPredictionJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTrustMlPredictionJobResponse setBody(ModifyTrustMlPredictionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTrustMlPredictionJobResponseBody getBody() {
        return this.body;
    }

}
