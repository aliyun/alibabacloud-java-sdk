// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSoundCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateSoundCodeResponse setBody(UpdateSoundCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSoundCodeResponseBody getBody() {
        return this.body;
    }

}
