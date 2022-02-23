// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CreateIntlAliyunAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIntlAliyunAccountResponseBody body;

    public static CreateIntlAliyunAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIntlAliyunAccountResponse self = new CreateIntlAliyunAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateIntlAliyunAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIntlAliyunAccountResponse setBody(CreateIntlAliyunAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIntlAliyunAccountResponseBody getBody() {
        return this.body;
    }

}
