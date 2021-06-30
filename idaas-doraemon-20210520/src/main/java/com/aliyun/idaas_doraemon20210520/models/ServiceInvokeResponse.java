// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ServiceInvokeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ServiceInvokeResponse setBody(ServiceInvokeResponseBody body) {
        this.body = body;
        return this;
    }
    public ServiceInvokeResponseBody getBody() {
        return this.body;
    }

}
