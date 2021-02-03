// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddGtmRecoveryPlanResponseBody body;

    public static AddGtmRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGtmRecoveryPlanResponse self = new AddGtmRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public AddGtmRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGtmRecoveryPlanResponse setBody(AddGtmRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGtmRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
