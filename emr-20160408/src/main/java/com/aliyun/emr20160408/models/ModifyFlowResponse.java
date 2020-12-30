// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyFlowResponseBody body;

    public static ModifyFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowResponse self = new ModifyFlowResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFlowResponse setBody(ModifyFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFlowResponseBody getBody() {
        return this.body;
    }

}
