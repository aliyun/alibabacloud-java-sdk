// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeThingServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InvokeThingServiceResponseBody body;

    public static InvokeThingServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeThingServiceResponse self = new InvokeThingServiceResponse();
        return TeaModel.build(map, self);
    }

    public InvokeThingServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeThingServiceResponse setBody(InvokeThingServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeThingServiceResponseBody getBody() {
        return this.body;
    }

}
