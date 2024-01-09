// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DeleteRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRecoveryPlanResponseBody body;

    public static DeleteRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecoveryPlanResponse self = new DeleteRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecoveryPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRecoveryPlanResponse setBody(DeleteRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
