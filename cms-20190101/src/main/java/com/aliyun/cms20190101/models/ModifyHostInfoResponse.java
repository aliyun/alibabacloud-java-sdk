// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHostInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHostInfoResponseBody body;

    public static ModifyHostInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostInfoResponse self = new ModifyHostInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHostInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHostInfoResponse setBody(ModifyHostInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHostInfoResponseBody getBody() {
        return this.body;
    }

}
