// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyFlowCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyFlowCategoryResponseBody body;

    public static ModifyFlowCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowCategoryResponse self = new ModifyFlowCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFlowCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFlowCategoryResponse setBody(ModifyFlowCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFlowCategoryResponseBody getBody() {
        return this.body;
    }

}
