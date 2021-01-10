// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetCasterChannelResponseBody body;

    public static SetCasterChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCasterChannelResponse self = new SetCasterChannelResponse();
        return TeaModel.build(map, self);
    }

    public SetCasterChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCasterChannelResponse setBody(SetCasterChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCasterChannelResponseBody getBody() {
        return this.body;
    }

}
