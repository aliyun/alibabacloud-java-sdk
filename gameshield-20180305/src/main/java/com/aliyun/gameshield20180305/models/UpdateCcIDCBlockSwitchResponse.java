// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateCcIDCBlockSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCcIDCBlockSwitchResponseBody body;

    public static UpdateCcIDCBlockSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcIDCBlockSwitchResponse self = new UpdateCcIDCBlockSwitchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCcIDCBlockSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCcIDCBlockSwitchResponse setBody(UpdateCcIDCBlockSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCcIDCBlockSwitchResponseBody getBody() {
        return this.body;
    }

}
