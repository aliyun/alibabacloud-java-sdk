// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ValidateTaobaoAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateTaobaoAccountResponseBody body;

    public static ValidateTaobaoAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateTaobaoAccountResponse self = new ValidateTaobaoAccountResponse();
        return TeaModel.build(map, self);
    }

    public ValidateTaobaoAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateTaobaoAccountResponse setBody(ValidateTaobaoAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateTaobaoAccountResponseBody getBody() {
        return this.body;
    }

}
