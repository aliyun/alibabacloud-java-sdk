// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetExperimentPlanTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExperimentPlanTemplateResponseBody body;

    public static GetExperimentPlanTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentPlanTemplateResponse self = new GetExperimentPlanTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentPlanTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentPlanTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExperimentPlanTemplateResponse setBody(GetExperimentPlanTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentPlanTemplateResponseBody getBody() {
        return this.body;
    }

}
