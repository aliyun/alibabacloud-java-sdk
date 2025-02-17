// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunMultiDocIntroductionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunMultiDocIntroductionResponseBody body;

    public static RunMultiDocIntroductionResponse build(java.util.Map<String, ?> map) throws Exception {
        RunMultiDocIntroductionResponse self = new RunMultiDocIntroductionResponse();
        return TeaModel.build(map, self);
    }

    public RunMultiDocIntroductionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunMultiDocIntroductionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunMultiDocIntroductionResponse setBody(RunMultiDocIntroductionResponseBody body) {
        this.body = body;
        return this;
    }
    public RunMultiDocIntroductionResponseBody getBody() {
        return this.body;
    }

}
