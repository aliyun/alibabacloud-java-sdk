// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class StopVMDeployOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopVMDeployOrderResponseBody body;

    public static StopVMDeployOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        StopVMDeployOrderResponse self = new StopVMDeployOrderResponse();
        return TeaModel.build(map, self);
    }

    public StopVMDeployOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopVMDeployOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopVMDeployOrderResponse setBody(StopVMDeployOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public StopVMDeployOrderResponseBody getBody() {
        return this.body;
    }

}
