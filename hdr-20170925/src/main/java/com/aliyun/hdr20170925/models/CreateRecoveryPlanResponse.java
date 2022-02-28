// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CreateRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRecoveryPlanResponseBody body;

    public static CreateRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecoveryPlanResponse self = new CreateRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecoveryPlanResponse setBody(CreateRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
