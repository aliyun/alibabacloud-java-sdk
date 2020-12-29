// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAntChainMemberResponseBody body;

    public static UpdateAntChainMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainMemberResponse self = new UpdateAntChainMemberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAntChainMemberResponse setBody(UpdateAntChainMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAntChainMemberResponseBody getBody() {
        return this.body;
    }

}
