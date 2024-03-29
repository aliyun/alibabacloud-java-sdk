// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ServiceInvokeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ServiceInvokeResponseBody body;

    public static ServiceInvokeResponse build(java.util.Map<String, ?> map) throws Exception {
        ServiceInvokeResponse self = new ServiceInvokeResponse();
        return TeaModel.build(map, self);
    }

    public ServiceInvokeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ServiceInvokeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ServiceInvokeResponse setBody(ServiceInvokeResponseBody body) {
        this.body = body;
        return this;
    }
    public ServiceInvokeResponseBody getBody() {
        return this.body;
    }

}
