// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class RetryVMDeployMachineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RetryVMDeployMachineResponseBody body;

    public static RetryVMDeployMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryVMDeployMachineResponse self = new RetryVMDeployMachineResponse();
        return TeaModel.build(map, self);
    }

    public RetryVMDeployMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryVMDeployMachineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryVMDeployMachineResponse setBody(RetryVMDeployMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryVMDeployMachineResponseBody getBody() {
        return this.body;
    }

}
