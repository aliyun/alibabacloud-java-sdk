// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteFlowEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CommonResult body;

    public static DeleteFlowEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowEndpointResponse self = new DeleteFlowEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFlowEndpointResponse setBody(CommonResult body) {
        this.body = body;
        return this;
    }
    public CommonResult getBody() {
        return this.body;
    }

}
