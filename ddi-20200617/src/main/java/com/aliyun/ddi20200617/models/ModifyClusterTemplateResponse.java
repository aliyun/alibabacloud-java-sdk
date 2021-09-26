// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyClusterTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClusterTemplateResponseBody body;

    public static ModifyClusterTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterTemplateResponse self = new ModifyClusterTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterTemplateResponse setBody(ModifyClusterTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterTemplateResponseBody getBody() {
        return this.body;
    }

}
