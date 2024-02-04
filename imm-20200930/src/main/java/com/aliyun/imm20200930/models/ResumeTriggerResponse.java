// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ResumeTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeTriggerResponseBody body;

    public static ResumeTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeTriggerResponse self = new ResumeTriggerResponse();
        return TeaModel.build(map, self);
    }

    public ResumeTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeTriggerResponse setBody(ResumeTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeTriggerResponseBody getBody() {
        return this.body;
    }

}
