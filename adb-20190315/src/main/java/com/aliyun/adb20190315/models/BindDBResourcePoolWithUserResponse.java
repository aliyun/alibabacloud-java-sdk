// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class BindDBResourcePoolWithUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindDBResourcePoolWithUserResponseBody body;

    public static BindDBResourcePoolWithUserResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDBResourcePoolWithUserResponse self = new BindDBResourcePoolWithUserResponse();
        return TeaModel.build(map, self);
    }

    public BindDBResourcePoolWithUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindDBResourcePoolWithUserResponse setBody(BindDBResourcePoolWithUserResponseBody body) {
        this.body = body;
        return this;
    }
    public BindDBResourcePoolWithUserResponseBody getBody() {
        return this.body;
    }

}
