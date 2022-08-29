// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ModifyTrustMlTrainingJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTrustMlTrainingJobResponseBody body;

    public static ModifyTrustMlTrainingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrustMlTrainingJobResponse self = new ModifyTrustMlTrainingJobResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTrustMlTrainingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTrustMlTrainingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTrustMlTrainingJobResponse setBody(ModifyTrustMlTrainingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTrustMlTrainingJobResponseBody getBody() {
        return this.body;
    }

}
