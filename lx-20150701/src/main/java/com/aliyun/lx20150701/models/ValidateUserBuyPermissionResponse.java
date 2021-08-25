// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class ValidateUserBuyPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateUserBuyPermissionResponseBody body;

    public static ValidateUserBuyPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateUserBuyPermissionResponse self = new ValidateUserBuyPermissionResponse();
        return TeaModel.build(map, self);
    }

    public ValidateUserBuyPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateUserBuyPermissionResponse setBody(ValidateUserBuyPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateUserBuyPermissionResponseBody getBody() {
        return this.body;
    }

}
