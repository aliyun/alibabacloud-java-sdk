// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ModifyInstanceRemarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceRemarkResponseBody body;

    public static ModifyInstanceRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceRemarkResponse self = new ModifyInstanceRemarkResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceRemarkResponse setBody(ModifyInstanceRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceRemarkResponseBody getBody() {
        return this.body;
    }

}
