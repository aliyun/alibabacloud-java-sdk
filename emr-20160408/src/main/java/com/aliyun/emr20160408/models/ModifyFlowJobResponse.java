// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyFlowJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public ModifyFlowJobResponse setBody(ModifyFlowJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFlowJobResponseBody getBody() {
        return this.body;
    }

}
