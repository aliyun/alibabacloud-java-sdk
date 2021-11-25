// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ResumeVMDeployOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeVMDeployOrderResponseBody body;

    public static ResumeVMDeployOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeVMDeployOrderResponse self = new ResumeVMDeployOrderResponse();
        return TeaModel.build(map, self);
    }

    public ResumeVMDeployOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeVMDeployOrderResponse setBody(ResumeVMDeployOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeVMDeployOrderResponseBody getBody() {
        return this.body;
    }

}
