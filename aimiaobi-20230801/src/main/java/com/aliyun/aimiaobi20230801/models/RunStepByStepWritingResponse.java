// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunStepByStepWritingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunStepByStepWritingResponseBody body;

    public static RunStepByStepWritingResponse build(java.util.Map<String, ?> map) throws Exception {
        RunStepByStepWritingResponse self = new RunStepByStepWritingResponse();
        return TeaModel.build(map, self);
    }

    public RunStepByStepWritingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunStepByStepWritingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunStepByStepWritingResponse setBody(RunStepByStepWritingResponseBody body) {
        this.body = body;
        return this;
    }
    public RunStepByStepWritingResponseBody getBody() {
        return this.body;
    }

}
