// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyResourceDiagnosisStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyResourceDiagnosisStatusResponseBody body;

    public static ModifyResourceDiagnosisStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceDiagnosisStatusResponse self = new ModifyResourceDiagnosisStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyResourceDiagnosisStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyResourceDiagnosisStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyResourceDiagnosisStatusResponse setBody(ModifyResourceDiagnosisStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyResourceDiagnosisStatusResponseBody getBody() {
        return this.body;
    }

}
