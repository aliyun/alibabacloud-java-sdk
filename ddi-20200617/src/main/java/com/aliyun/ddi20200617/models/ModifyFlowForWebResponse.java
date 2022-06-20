// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyFlowForWebResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyFlowForWebResponseBody body;

    public static ModifyFlowForWebResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowForWebResponse self = new ModifyFlowForWebResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFlowForWebResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFlowForWebResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFlowForWebResponse setBody(ModifyFlowForWebResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFlowForWebResponseBody getBody() {
        return this.body;
    }

}
