// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class DeleteExperimentPlanTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExperimentPlanTemplateResponseBody body;

    public static DeleteExperimentPlanTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentPlanTemplateResponse self = new DeleteExperimentPlanTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentPlanTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExperimentPlanTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExperimentPlanTemplateResponse setBody(DeleteExperimentPlanTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExperimentPlanTemplateResponseBody getBody() {
        return this.body;
    }

}
