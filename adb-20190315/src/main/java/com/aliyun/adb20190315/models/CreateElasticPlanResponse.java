// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class CreateElasticPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateElasticPlanResponseBody body;

    public static CreateElasticPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticPlanResponse self = new CreateElasticPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateElasticPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateElasticPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateElasticPlanResponse setBody(CreateElasticPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateElasticPlanResponseBody getBody() {
        return this.body;
    }

}
