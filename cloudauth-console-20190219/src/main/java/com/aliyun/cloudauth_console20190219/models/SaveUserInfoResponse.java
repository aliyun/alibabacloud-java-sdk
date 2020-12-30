// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class SaveUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveUserInfoResponseBody body;

    public static SaveUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveUserInfoResponse self = new SaveUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public SaveUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveUserInfoResponse setBody(SaveUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveUserInfoResponseBody getBody() {
        return this.body;
    }

}
