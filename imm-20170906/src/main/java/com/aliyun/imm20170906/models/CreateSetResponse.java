// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSetResponseBody body;

    public static CreateSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSetResponse self = new CreateSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSetResponse setBody(CreateSetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSetResponseBody getBody() {
        return this.body;
    }

}
