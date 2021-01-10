// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeDataAPIServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InvokeDataAPIServiceResponseBody body;

    public static InvokeDataAPIServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeDataAPIServiceResponse self = new InvokeDataAPIServiceResponse();
        return TeaModel.build(map, self);
    }

    public InvokeDataAPIServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeDataAPIServiceResponse setBody(InvokeDataAPIServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeDataAPIServiceResponseBody getBody() {
        return this.body;
    }

}
