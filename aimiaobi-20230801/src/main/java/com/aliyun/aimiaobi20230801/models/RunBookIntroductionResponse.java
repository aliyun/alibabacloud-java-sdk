// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunBookIntroductionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunBookIntroductionResponseBody body;

    public static RunBookIntroductionResponse build(java.util.Map<String, ?> map) throws Exception {
        RunBookIntroductionResponse self = new RunBookIntroductionResponse();
        return TeaModel.build(map, self);
    }

    public RunBookIntroductionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunBookIntroductionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunBookIntroductionResponse setBody(RunBookIntroductionResponseBody body) {
        this.body = body;
        return this;
    }
    public RunBookIntroductionResponseBody getBody() {
        return this.body;
    }

}
