// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class ModifyProjectResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyProjectResourceResponseBody body;

    public static ModifyProjectResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProjectResourceResponse self = new ModifyProjectResourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProjectResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProjectResourceResponse setBody(ModifyProjectResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProjectResourceResponseBody getBody() {
        return this.body;
    }

}
