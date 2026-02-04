// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateBroadcastAudioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBroadcastAudioResponseBody body;

    public static CreateBroadcastAudioResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBroadcastAudioResponse self = new CreateBroadcastAudioResponse();
        return TeaModel.build(map, self);
    }

    public CreateBroadcastAudioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBroadcastAudioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBroadcastAudioResponse setBody(CreateBroadcastAudioResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBroadcastAudioResponseBody getBody() {
        return this.body;
    }

}
