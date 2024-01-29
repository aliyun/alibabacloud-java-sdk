// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddGtmRecoveryPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGtmRecoveryPlanResponse setBody(AddGtmRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGtmRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
