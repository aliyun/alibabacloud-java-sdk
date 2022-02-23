// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CreateAliyunAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAliyunAccountResponseBody body;

    public static CreateAliyunAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAliyunAccountResponse self = new CreateAliyunAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateAliyunAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAliyunAccountResponse setBody(CreateAliyunAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAliyunAccountResponseBody getBody() {
        return this.body;
    }

}
