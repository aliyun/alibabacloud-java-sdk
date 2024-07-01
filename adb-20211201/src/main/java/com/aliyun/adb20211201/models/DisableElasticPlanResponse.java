// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DisableElasticPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableElasticPlanResponseBody body;

    public static DisableElasticPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableElasticPlanResponse self = new DisableElasticPlanResponse();
        return TeaModel.build(map, self);
    }

    public DisableElasticPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableElasticPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableElasticPlanResponse setBody(DisableElasticPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableElasticPlanResponseBody getBody() {
        return this.body;
    }

}
