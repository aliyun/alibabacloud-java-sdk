// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricConsortiumMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFabricConsortiumMemberResponseBody body;

    public static CreateFabricConsortiumMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricConsortiumMemberResponse self = new CreateFabricConsortiumMemberResponse();
        return TeaModel.build(map, self);
    }

    public CreateFabricConsortiumMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFabricConsortiumMemberResponse setBody(CreateFabricConsortiumMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFabricConsortiumMemberResponseBody getBody() {
        return this.body;
    }

}
