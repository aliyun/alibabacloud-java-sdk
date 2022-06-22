// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateExperimentFlowDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateExperimentFlowDefinitionResponseBody body;

    public static UpdateExperimentFlowDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentFlowDefinitionResponse self = new UpdateExperimentFlowDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentFlowDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentFlowDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExperimentFlowDefinitionResponse setBody(UpdateExperimentFlowDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentFlowDefinitionResponseBody getBody() {
        return this.body;
    }

}
