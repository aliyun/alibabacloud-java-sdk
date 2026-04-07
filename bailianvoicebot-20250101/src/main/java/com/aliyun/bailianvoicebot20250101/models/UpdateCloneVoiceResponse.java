// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class UpdateCloneVoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloneVoiceResponseBody body;

    public static UpdateCloneVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloneVoiceResponse self = new UpdateCloneVoiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloneVoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloneVoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloneVoiceResponse setBody(UpdateCloneVoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloneVoiceResponseBody getBody() {
        return this.body;
    }

}
