// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEnsServiceResponseBody body;

    public static CreateEnsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnsServiceResponse self = new CreateEnsServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnsServiceResponse setBody(CreateEnsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnsServiceResponseBody getBody() {
        return this.body;
    }

}
