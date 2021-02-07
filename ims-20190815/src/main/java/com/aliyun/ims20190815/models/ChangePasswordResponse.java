// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ChangePasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangePasswordResponseBody body;

    public static ChangePasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangePasswordResponse self = new ChangePasswordResponse();
        return TeaModel.build(map, self);
    }

    public ChangePasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangePasswordResponse setBody(ChangePasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangePasswordResponseBody getBody() {
        return this.body;
    }

}
