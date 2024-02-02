// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSoundCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSoundCodeResponseBody body;

    public static CreateSoundCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSoundCodeResponse self = new CreateSoundCodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateSoundCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSoundCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSoundCodeResponse setBody(CreateSoundCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSoundCodeResponseBody getBody() {
        return this.body;
    }

}
