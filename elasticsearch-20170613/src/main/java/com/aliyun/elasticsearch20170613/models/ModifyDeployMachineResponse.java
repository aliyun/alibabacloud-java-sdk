// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ModifyDeployMachineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDeployMachineResponseBody body;

    public static ModifyDeployMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeployMachineResponse self = new ModifyDeployMachineResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDeployMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDeployMachineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDeployMachineResponse setBody(ModifyDeployMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDeployMachineResponseBody getBody() {
        return this.body;
    }

}
