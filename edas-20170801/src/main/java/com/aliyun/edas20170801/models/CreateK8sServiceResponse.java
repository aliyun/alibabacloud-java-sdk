// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateK8sServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateK8sServiceResponseBody body;

    public static CreateK8sServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateK8sServiceResponse self = new CreateK8sServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateK8sServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateK8sServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateK8sServiceResponse setBody(CreateK8sServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateK8sServiceResponseBody getBody() {
        return this.body;
    }

}
