// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class VoiceGroupCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VoiceGroupCallResponseBody body;

    public static VoiceGroupCallResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceGroupCallResponse self = new VoiceGroupCallResponse();
        return TeaModel.build(map, self);
    }

    public VoiceGroupCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceGroupCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceGroupCallResponse setBody(VoiceGroupCallResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceGroupCallResponseBody getBody() {
        return this.body;
    }

}
