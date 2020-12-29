// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGtmRecoveryPlanResponseBody body;

    public static UpdateGtmRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmRecoveryPlanResponse self = new UpdateGtmRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGtmRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGtmRecoveryPlanResponse setBody(UpdateGtmRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGtmRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
