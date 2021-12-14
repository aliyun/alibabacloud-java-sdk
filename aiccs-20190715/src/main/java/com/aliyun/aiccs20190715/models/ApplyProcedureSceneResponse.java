// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class ApplyProcedureSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyProcedureSceneResponseBody body;

    public static ApplyProcedureSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyProcedureSceneResponse self = new ApplyProcedureSceneResponse();
        return TeaModel.build(map, self);
    }

    public ApplyProcedureSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyProcedureSceneResponse setBody(ApplyProcedureSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyProcedureSceneResponseBody getBody() {
        return this.body;
    }

}
