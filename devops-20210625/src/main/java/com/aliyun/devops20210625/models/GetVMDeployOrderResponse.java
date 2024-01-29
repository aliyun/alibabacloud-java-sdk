// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetVMDeployOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVMDeployOrderResponseBody body;

    public static GetVMDeployOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVMDeployOrderResponse self = new GetVMDeployOrderResponse();
        return TeaModel.build(map, self);
    }

    public GetVMDeployOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVMDeployOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVMDeployOrderResponse setBody(GetVMDeployOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVMDeployOrderResponseBody getBody() {
        return this.body;
    }

}
