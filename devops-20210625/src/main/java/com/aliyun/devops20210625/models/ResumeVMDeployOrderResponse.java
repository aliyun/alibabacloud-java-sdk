// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ResumeVMDeployOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ResumeVMDeployOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeVMDeployOrderResponse setBody(ResumeVMDeployOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeVMDeployOrderResponseBody getBody() {
        return this.body;
    }

}
