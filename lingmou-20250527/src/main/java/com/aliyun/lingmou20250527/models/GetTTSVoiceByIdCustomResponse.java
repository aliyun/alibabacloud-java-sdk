// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class GetTTSVoiceByIdCustomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTTSVoiceByIdCustomResponseBody body;

    public static GetTTSVoiceByIdCustomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTTSVoiceByIdCustomResponse self = new GetTTSVoiceByIdCustomResponse();
        return TeaModel.build(map, self);
    }

    public GetTTSVoiceByIdCustomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTTSVoiceByIdCustomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTTSVoiceByIdCustomResponse setBody(GetTTSVoiceByIdCustomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTTSVoiceByIdCustomResponseBody getBody() {
        return this.body;
    }

}
