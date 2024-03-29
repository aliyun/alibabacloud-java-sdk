// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyFlowJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyFlowJobResponseBody body;

    public static ModifyFlowJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowJobResponse self = new ModifyFlowJobResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFlowJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFlowJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFlowJobResponse setBody(ModifyFlowJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFlowJobResponseBody getBody() {
        return this.body;
    }

}
