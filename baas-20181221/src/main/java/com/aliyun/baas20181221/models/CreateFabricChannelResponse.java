// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFabricChannelResponseBody body;

    public static CreateFabricChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricChannelResponse self = new CreateFabricChannelResponse();
        return TeaModel.build(map, self);
    }

    public CreateFabricChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFabricChannelResponse setBody(CreateFabricChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFabricChannelResponseBody getBody() {
        return this.body;
    }

}
