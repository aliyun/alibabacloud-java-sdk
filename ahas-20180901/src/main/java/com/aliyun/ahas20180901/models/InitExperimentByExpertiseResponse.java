// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class InitExperimentByExpertiseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InitExperimentByExpertiseResponseBody body;

    public static InitExperimentByExpertiseResponse build(java.util.Map<String, ?> map) throws Exception {
        InitExperimentByExpertiseResponse self = new InitExperimentByExpertiseResponse();
        return TeaModel.build(map, self);
    }

    public InitExperimentByExpertiseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitExperimentByExpertiseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitExperimentByExpertiseResponse setBody(InitExperimentByExpertiseResponseBody body) {
        this.body = body;
        return this;
    }
    public InitExperimentByExpertiseResponseBody getBody() {
        return this.body;
    }

}
