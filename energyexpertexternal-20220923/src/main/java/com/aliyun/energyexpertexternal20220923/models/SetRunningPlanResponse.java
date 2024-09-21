// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SetRunningPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetRunningPlanResponseBody body;

    public static SetRunningPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        SetRunningPlanResponse self = new SetRunningPlanResponse();
        return TeaModel.build(map, self);
    }

    public SetRunningPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetRunningPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetRunningPlanResponse setBody(SetRunningPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public SetRunningPlanResponseBody getBody() {
        return this.body;
    }

}
