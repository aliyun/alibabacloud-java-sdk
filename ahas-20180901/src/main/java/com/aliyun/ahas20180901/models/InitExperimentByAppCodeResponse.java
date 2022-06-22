// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class InitExperimentByAppCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InitExperimentByAppCodeResponseBody body;

    public static InitExperimentByAppCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        InitExperimentByAppCodeResponse self = new InitExperimentByAppCodeResponse();
        return TeaModel.build(map, self);
    }

    public InitExperimentByAppCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitExperimentByAppCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitExperimentByAppCodeResponse setBody(InitExperimentByAppCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public InitExperimentByAppCodeResponseBody getBody() {
        return this.body;
    }

}
