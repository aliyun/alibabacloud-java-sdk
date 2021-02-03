// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteGtmRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGtmRecoveryPlanResponseBody body;

    public static DeleteGtmRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGtmRecoveryPlanResponse self = new DeleteGtmRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGtmRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGtmRecoveryPlanResponse setBody(DeleteGtmRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGtmRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
