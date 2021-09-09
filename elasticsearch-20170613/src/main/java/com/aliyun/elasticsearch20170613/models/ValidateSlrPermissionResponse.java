// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateSlrPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateSlrPermissionResponseBody body;

    public static ValidateSlrPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateSlrPermissionResponse self = new ValidateSlrPermissionResponse();
        return TeaModel.build(map, self);
    }

    public ValidateSlrPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateSlrPermissionResponse setBody(ValidateSlrPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateSlrPermissionResponseBody getBody() {
        return this.body;
    }

}
