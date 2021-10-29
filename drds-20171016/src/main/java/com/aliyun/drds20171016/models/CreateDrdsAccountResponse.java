// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class CreateDrdsAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDrdsAccountResponseBody body;

    public static CreateDrdsAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsAccountResponse self = new CreateDrdsAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateDrdsAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDrdsAccountResponse setBody(CreateDrdsAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDrdsAccountResponseBody getBody() {
        return this.body;
    }

}
