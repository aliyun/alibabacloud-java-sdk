// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopPolicysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDesktopPolicysResponseBody body;

    public static ModifyDesktopPolicysResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopPolicysResponse self = new ModifyDesktopPolicysResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopPolicysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDesktopPolicysResponse setBody(ModifyDesktopPolicysResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDesktopPolicysResponseBody getBody() {
        return this.body;
    }

}
