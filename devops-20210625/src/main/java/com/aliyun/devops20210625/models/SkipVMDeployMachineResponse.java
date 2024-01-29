// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class SkipVMDeployMachineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SkipVMDeployMachineResponseBody body;

    public static SkipVMDeployMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipVMDeployMachineResponse self = new SkipVMDeployMachineResponse();
        return TeaModel.build(map, self);
    }

    public SkipVMDeployMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipVMDeployMachineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SkipVMDeployMachineResponse setBody(SkipVMDeployMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipVMDeployMachineResponseBody getBody() {
        return this.body;
    }

}
