// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ConfirmFabricConsortiumMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmFabricConsortiumMemberResponseBody body;

    public static ConfirmFabricConsortiumMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmFabricConsortiumMemberResponse self = new ConfirmFabricConsortiumMemberResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmFabricConsortiumMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmFabricConsortiumMemberResponse setBody(ConfirmFabricConsortiumMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmFabricConsortiumMemberResponseBody getBody() {
        return this.body;
    }

}
