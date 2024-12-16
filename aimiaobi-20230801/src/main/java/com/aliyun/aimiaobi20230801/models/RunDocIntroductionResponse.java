// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocIntroductionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunDocIntroductionResponseBody body;

    public static RunDocIntroductionResponse build(java.util.Map<String, ?> map) throws Exception {
        RunDocIntroductionResponse self = new RunDocIntroductionResponse();
        return TeaModel.build(map, self);
    }

    public RunDocIntroductionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunDocIntroductionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunDocIntroductionResponse setBody(RunDocIntroductionResponseBody body) {
        this.body = body;
        return this;
    }
    public RunDocIntroductionResponseBody getBody() {
        return this.body;
    }

}
