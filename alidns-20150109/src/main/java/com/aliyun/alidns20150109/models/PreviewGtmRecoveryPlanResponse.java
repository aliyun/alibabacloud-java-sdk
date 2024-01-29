// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class PreviewGtmRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewGtmRecoveryPlanResponseBody body;

    public static PreviewGtmRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewGtmRecoveryPlanResponse self = new PreviewGtmRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public PreviewGtmRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewGtmRecoveryPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewGtmRecoveryPlanResponse setBody(PreviewGtmRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewGtmRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
