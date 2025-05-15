// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class UpdateExperimentPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExperimentPlanResponseBody body;

    public static UpdateExperimentPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentPlanResponse self = new UpdateExperimentPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExperimentPlanResponse setBody(UpdateExperimentPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentPlanResponseBody getBody() {
        return this.body;
    }

}
