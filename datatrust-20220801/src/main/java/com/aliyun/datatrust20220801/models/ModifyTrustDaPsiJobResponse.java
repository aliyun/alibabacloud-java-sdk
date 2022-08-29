// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ModifyTrustDaPsiJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTrustDaPsiJobResponseBody body;

    public static ModifyTrustDaPsiJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrustDaPsiJobResponse self = new ModifyTrustDaPsiJobResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTrustDaPsiJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTrustDaPsiJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTrustDaPsiJobResponse setBody(ModifyTrustDaPsiJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTrustDaPsiJobResponseBody getBody() {
        return this.body;
    }

}
