// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ModifyTrustDaSqlJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTrustDaSqlJobResponseBody body;

    public static ModifyTrustDaSqlJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrustDaSqlJobResponse self = new ModifyTrustDaSqlJobResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTrustDaSqlJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTrustDaSqlJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTrustDaSqlJobResponse setBody(ModifyTrustDaSqlJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTrustDaSqlJobResponseBody getBody() {
        return this.body;
    }

}
