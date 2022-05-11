// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateAudioFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAudioFileResponseBody body;

    public static CreateAudioFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAudioFileResponse self = new CreateAudioFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateAudioFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAudioFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAudioFileResponse setBody(CreateAudioFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAudioFileResponseBody getBody() {
        return this.body;
    }

}
