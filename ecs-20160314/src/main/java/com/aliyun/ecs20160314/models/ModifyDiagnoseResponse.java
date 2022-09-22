// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyDiagnoseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDiagnoseResponseBody body;

    public static ModifyDiagnoseResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiagnoseResponse self = new ModifyDiagnoseResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiagnoseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDiagnoseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDiagnoseResponse setBody(ModifyDiagnoseResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDiagnoseResponseBody getBody() {
        return this.body;
    }

}
