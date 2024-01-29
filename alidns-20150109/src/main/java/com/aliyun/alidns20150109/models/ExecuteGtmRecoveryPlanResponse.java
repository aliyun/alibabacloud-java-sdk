// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ExecuteGtmRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteGtmRecoveryPlanResponseBody body;

    public static ExecuteGtmRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteGtmRecoveryPlanResponse self = new ExecuteGtmRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteGtmRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteGtmRecoveryPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteGtmRecoveryPlanResponse setBody(ExecuteGtmRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteGtmRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
