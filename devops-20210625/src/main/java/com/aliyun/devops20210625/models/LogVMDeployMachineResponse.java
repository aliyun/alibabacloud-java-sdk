// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class LogVMDeployMachineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LogVMDeployMachineResponseBody body;

    public static LogVMDeployMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        LogVMDeployMachineResponse self = new LogVMDeployMachineResponse();
        return TeaModel.build(map, self);
    }

    public LogVMDeployMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LogVMDeployMachineResponse setBody(LogVMDeployMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public LogVMDeployMachineResponseBody getBody() {
        return this.body;
    }

}
