// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class SetScreenInteractionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetScreenInteractionResponseBody body;

    public static SetScreenInteractionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetScreenInteractionResponse self = new SetScreenInteractionResponse();
        return TeaModel.build(map, self);
    }

    public SetScreenInteractionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetScreenInteractionResponse setBody(SetScreenInteractionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetScreenInteractionResponseBody getBody() {
        return this.body;
    }

}
