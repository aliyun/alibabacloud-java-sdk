// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RollbackGtmRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackGtmRecoveryPlanResponseBody body;

    public static RollbackGtmRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackGtmRecoveryPlanResponse self = new RollbackGtmRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public RollbackGtmRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackGtmRecoveryPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackGtmRecoveryPlanResponse setBody(RollbackGtmRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackGtmRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
