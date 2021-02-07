// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdatePhoneSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePhoneSwitchResponseBody body;

    public static UpdatePhoneSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhoneSwitchResponse self = new UpdatePhoneSwitchResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePhoneSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePhoneSwitchResponse setBody(UpdatePhoneSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePhoneSwitchResponseBody getBody() {
        return this.body;
    }

}
