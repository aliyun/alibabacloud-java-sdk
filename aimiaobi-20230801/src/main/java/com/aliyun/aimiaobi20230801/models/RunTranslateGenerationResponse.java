// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTranslateGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunTranslateGenerationResponseBody body;

    public static RunTranslateGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunTranslateGenerationResponse self = new RunTranslateGenerationResponse();
        return TeaModel.build(map, self);
    }

    public RunTranslateGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunTranslateGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunTranslateGenerationResponse setBody(RunTranslateGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunTranslateGenerationResponseBody getBody() {
        return this.body;
    }

}
