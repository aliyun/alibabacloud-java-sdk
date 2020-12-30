// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateFaultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFaultResponseBody body;

    public static CreateFaultResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFaultResponse self = new CreateFaultResponse();
        return TeaModel.build(map, self);
    }

    public CreateFaultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFaultResponse setBody(CreateFaultResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFaultResponseBody getBody() {
        return this.body;
    }

}
