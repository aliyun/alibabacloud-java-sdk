// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PushVoiceBoxCommandsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushVoiceBoxCommandsResponseBody body;

    public static PushVoiceBoxCommandsResponse build(java.util.Map<String, ?> map) throws Exception {
        PushVoiceBoxCommandsResponse self = new PushVoiceBoxCommandsResponse();
        return TeaModel.build(map, self);
    }

    public PushVoiceBoxCommandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushVoiceBoxCommandsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushVoiceBoxCommandsResponse setBody(PushVoiceBoxCommandsResponseBody body) {
        this.body = body;
        return this;
    }
    public PushVoiceBoxCommandsResponseBody getBody() {
        return this.body;
    }

}
