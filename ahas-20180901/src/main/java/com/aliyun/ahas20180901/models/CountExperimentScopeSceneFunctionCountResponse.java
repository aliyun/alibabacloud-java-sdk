// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CountExperimentScopeSceneFunctionCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CountExperimentScopeSceneFunctionCountResponseBody body;

    public static CountExperimentScopeSceneFunctionCountResponse build(java.util.Map<String, ?> map) throws Exception {
        CountExperimentScopeSceneFunctionCountResponse self = new CountExperimentScopeSceneFunctionCountResponse();
        return TeaModel.build(map, self);
    }

    public CountExperimentScopeSceneFunctionCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountExperimentScopeSceneFunctionCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CountExperimentScopeSceneFunctionCountResponse setBody(CountExperimentScopeSceneFunctionCountResponseBody body) {
        this.body = body;
        return this;
    }
    public CountExperimentScopeSceneFunctionCountResponseBody getBody() {
        return this.body;
    }

}
