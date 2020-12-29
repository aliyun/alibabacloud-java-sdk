// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyCenAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCenAttributeResponseBody body;

    public static ModifyCenAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCenAttributeResponse self = new ModifyCenAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCenAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCenAttributeResponse setBody(ModifyCenAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCenAttributeResponseBody getBody() {
        return this.body;
    }

}
