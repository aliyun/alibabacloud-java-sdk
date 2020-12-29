// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricChannelMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFabricChannelMemberResponseBody body;

    public static CreateFabricChannelMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricChannelMemberResponse self = new CreateFabricChannelMemberResponse();
        return TeaModel.build(map, self);
    }

    public CreateFabricChannelMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFabricChannelMemberResponse setBody(CreateFabricChannelMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFabricChannelMemberResponseBody getBody() {
        return this.body;
    }

}
