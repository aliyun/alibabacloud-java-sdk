// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSnatEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSnatEntryResponseBody body;

    public static CreateSnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSnatEntryResponse self = new CreateSnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateSnatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSnatEntryResponse setBody(CreateSnatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSnatEntryResponseBody getBody() {
        return this.body;
    }

}
