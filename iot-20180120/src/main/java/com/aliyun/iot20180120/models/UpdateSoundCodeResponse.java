// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSoundCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSoundCodeResponseBody body;

    public static UpdateSoundCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSoundCodeResponse self = new UpdateSoundCodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSoundCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSoundCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSoundCodeResponse setBody(UpdateSoundCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSoundCodeResponseBody getBody() {
        return this.body;
    }

}
