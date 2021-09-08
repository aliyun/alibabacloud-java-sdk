// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeThingsServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InvokeThingsServiceResponseBody body;

    public static InvokeThingsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeThingsServiceResponse self = new InvokeThingsServiceResponse();
        return TeaModel.build(map, self);
    }

    public InvokeThingsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeThingsServiceResponse setBody(InvokeThingsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeThingsServiceResponseBody getBody() {
        return this.body;
    }

}
