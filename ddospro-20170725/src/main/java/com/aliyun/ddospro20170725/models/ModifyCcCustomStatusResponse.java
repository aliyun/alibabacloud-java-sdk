// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyCcCustomStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCcCustomStatusResponseBody body;

    public static ModifyCcCustomStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCcCustomStatusResponse self = new ModifyCcCustomStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCcCustomStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCcCustomStatusResponse setBody(ModifyCcCustomStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCcCustomStatusResponseBody getBody() {
        return this.body;
    }

}
