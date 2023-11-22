// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public ModifyFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFlowResponse setBody(ModifyFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFlowResponseBody getBody() {
        return this.body;
    }

}
