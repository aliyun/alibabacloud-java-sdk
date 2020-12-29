// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class JoinFabricChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public JoinFabricChannelResponseBody body;

    public static JoinFabricChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinFabricChannelResponse self = new JoinFabricChannelResponse();
        return TeaModel.build(map, self);
    }

    public JoinFabricChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinFabricChannelResponse setBody(JoinFabricChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinFabricChannelResponseBody getBody() {
        return this.body;
    }

}
