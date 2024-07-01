// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class EnableElasticPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableElasticPlanResponseBody body;

    public static EnableElasticPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableElasticPlanResponse self = new EnableElasticPlanResponse();
        return TeaModel.build(map, self);
    }

    public EnableElasticPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableElasticPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableElasticPlanResponse setBody(EnableElasticPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableElasticPlanResponseBody getBody() {
        return this.body;
    }

}
