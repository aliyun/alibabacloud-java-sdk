// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class UpdateExperimentPlanTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExperimentPlanTemplateResponseBody body;

    public static UpdateExperimentPlanTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentPlanTemplateResponse self = new UpdateExperimentPlanTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentPlanTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentPlanTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExperimentPlanTemplateResponse setBody(UpdateExperimentPlanTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentPlanTemplateResponseBody getBody() {
        return this.body;
    }

}
