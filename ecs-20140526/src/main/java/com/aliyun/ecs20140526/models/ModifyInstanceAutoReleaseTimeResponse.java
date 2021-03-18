// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoReleaseTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceAutoReleaseTimeResponseBody body;

    public static ModifyInstanceAutoReleaseTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoReleaseTimeResponse self = new ModifyInstanceAutoReleaseTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoReleaseTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceAutoReleaseTimeResponse setBody(ModifyInstanceAutoReleaseTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceAutoReleaseTimeResponseBody getBody() {
        return this.body;
    }

}
