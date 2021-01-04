// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyCcStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCcStatusResponseBody body;

    public static ModifyCcStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCcStatusResponse self = new ModifyCcStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCcStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCcStatusResponse setBody(ModifyCcStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCcStatusResponseBody getBody() {
        return this.body;
    }

}
