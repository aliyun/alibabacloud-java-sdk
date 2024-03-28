// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListFunctionDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFunctionDeploymentResponseBody body;

    public static ListFunctionDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionDeploymentResponse self = new ListFunctionDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public ListFunctionDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFunctionDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFunctionDeploymentResponse setBody(ListFunctionDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFunctionDeploymentResponseBody getBody() {
        return this.body;
    }

}
