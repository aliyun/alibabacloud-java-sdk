// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class CreateExperimentPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExperimentPlanResponseBody body;

    public static CreateExperimentPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentPlanResponse self = new CreateExperimentPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateExperimentPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExperimentPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExperimentPlanResponse setBody(CreateExperimentPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExperimentPlanResponseBody getBody() {
        return this.body;
    }

}
