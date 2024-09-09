// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunWriteToneGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunWriteToneGenerationResponseBody body;

    public static RunWriteToneGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunWriteToneGenerationResponse self = new RunWriteToneGenerationResponse();
        return TeaModel.build(map, self);
    }

    public RunWriteToneGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunWriteToneGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunWriteToneGenerationResponse setBody(RunWriteToneGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunWriteToneGenerationResponseBody getBody() {
        return this.body;
    }

}
