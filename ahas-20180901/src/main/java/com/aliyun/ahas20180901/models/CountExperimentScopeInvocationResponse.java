// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CountExperimentScopeInvocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CountExperimentScopeInvocationResponseBody body;

    public static CountExperimentScopeInvocationResponse build(java.util.Map<String, ?> map) throws Exception {
        CountExperimentScopeInvocationResponse self = new CountExperimentScopeInvocationResponse();
        return TeaModel.build(map, self);
    }

    public CountExperimentScopeInvocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountExperimentScopeInvocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CountExperimentScopeInvocationResponse setBody(CountExperimentScopeInvocationResponseBody body) {
        this.body = body;
        return this;
    }
    public CountExperimentScopeInvocationResponseBody getBody() {
        return this.body;
    }

}
