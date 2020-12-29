// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricConsortiumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFabricConsortiumResponseBody body;

    public static CreateFabricConsortiumResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricConsortiumResponse self = new CreateFabricConsortiumResponse();
        return TeaModel.build(map, self);
    }

    public CreateFabricConsortiumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFabricConsortiumResponse setBody(CreateFabricConsortiumResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFabricConsortiumResponseBody getBody() {
        return this.body;
    }

}
