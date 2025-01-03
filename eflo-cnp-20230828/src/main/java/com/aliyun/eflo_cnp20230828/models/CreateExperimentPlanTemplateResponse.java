// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class CreateExperimentPlanTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExperimentPlanTemplateResponseBody body;

    public static CreateExperimentPlanTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentPlanTemplateResponse self = new CreateExperimentPlanTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateExperimentPlanTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExperimentPlanTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExperimentPlanTemplateResponse setBody(CreateExperimentPlanTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExperimentPlanTemplateResponseBody getBody() {
        return this.body;
    }

}
