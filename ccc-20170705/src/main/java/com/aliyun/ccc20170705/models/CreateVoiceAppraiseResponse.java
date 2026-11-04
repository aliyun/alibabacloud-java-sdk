// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateVoiceAppraiseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVoiceAppraiseResponseBody body;

    public static CreateVoiceAppraiseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVoiceAppraiseResponse self = new CreateVoiceAppraiseResponse();
        return TeaModel.build(map, self);
    }

    public CreateVoiceAppraiseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVoiceAppraiseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVoiceAppraiseResponse setBody(CreateVoiceAppraiseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVoiceAppraiseResponseBody getBody() {
        return this.body;
    }

}
