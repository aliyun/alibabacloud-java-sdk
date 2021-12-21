// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyFlowVariableCollectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyFlowVariableCollectionResponseBody body;

    public static ModifyFlowVariableCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowVariableCollectionResponse self = new ModifyFlowVariableCollectionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFlowVariableCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFlowVariableCollectionResponse setBody(ModifyFlowVariableCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFlowVariableCollectionResponseBody getBody() {
        return this.body;
    }

}
