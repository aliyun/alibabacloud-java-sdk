// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSoundCodeLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSoundCodeLabelResponseBody body;

    public static CreateSoundCodeLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSoundCodeLabelResponse self = new CreateSoundCodeLabelResponse();
        return TeaModel.build(map, self);
    }

    public CreateSoundCodeLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSoundCodeLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSoundCodeLabelResponse setBody(CreateSoundCodeLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSoundCodeLabelResponseBody getBody() {
        return this.body;
    }

}
