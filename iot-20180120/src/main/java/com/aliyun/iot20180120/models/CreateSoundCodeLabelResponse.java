// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSoundCodeLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateSoundCodeLabelResponse setBody(CreateSoundCodeLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSoundCodeLabelResponseBody getBody() {
        return this.body;
    }

}
