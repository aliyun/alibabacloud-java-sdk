// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class DeleteExperimentPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExperimentPlanResponseBody body;

    public static DeleteExperimentPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentPlanResponse self = new DeleteExperimentPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExperimentPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExperimentPlanResponse setBody(DeleteExperimentPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExperimentPlanResponseBody getBody() {
        return this.body;
    }

}
