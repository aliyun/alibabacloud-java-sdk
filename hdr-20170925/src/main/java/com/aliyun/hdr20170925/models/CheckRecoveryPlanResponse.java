// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CheckRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckRecoveryPlanResponseBody body;

    public static CheckRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRecoveryPlanResponse self = new CheckRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public CheckRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckRecoveryPlanResponse setBody(CheckRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
