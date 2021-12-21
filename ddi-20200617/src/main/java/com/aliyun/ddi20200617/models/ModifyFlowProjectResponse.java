// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyFlowProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyFlowProjectResponseBody body;

    public static ModifyFlowProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowProjectResponse self = new ModifyFlowProjectResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFlowProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFlowProjectResponse setBody(ModifyFlowProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFlowProjectResponseBody getBody() {
        return this.body;
    }

}
