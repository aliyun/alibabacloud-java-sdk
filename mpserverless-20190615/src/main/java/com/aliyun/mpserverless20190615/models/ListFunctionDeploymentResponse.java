// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListFunctionDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListFunctionDeploymentResponse setBody(ListFunctionDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFunctionDeploymentResponseBody getBody() {
        return this.body;
    }

}
