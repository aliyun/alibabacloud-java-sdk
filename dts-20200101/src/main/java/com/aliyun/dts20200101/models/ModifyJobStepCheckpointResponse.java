// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyJobStepCheckpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyJobStepCheckpointResponseBody body;

    public static ModifyJobStepCheckpointResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyJobStepCheckpointResponse self = new ModifyJobStepCheckpointResponse();
        return TeaModel.build(map, self);
    }

    public ModifyJobStepCheckpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyJobStepCheckpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyJobStepCheckpointResponse setBody(ModifyJobStepCheckpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyJobStepCheckpointResponseBody getBody() {
        return this.body;
    }

}
