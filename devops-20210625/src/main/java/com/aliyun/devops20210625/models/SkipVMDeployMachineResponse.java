// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class SkipVMDeployMachineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SkipVMDeployMachineResponse setBody(SkipVMDeployMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipVMDeployMachineResponseBody getBody() {
        return this.body;
    }

}
