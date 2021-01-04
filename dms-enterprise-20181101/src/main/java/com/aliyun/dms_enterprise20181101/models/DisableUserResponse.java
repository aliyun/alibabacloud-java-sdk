// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DisableUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableUserResponseBody body;

    public static DisableUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableUserResponse self = new DisableUserResponse();
        return TeaModel.build(map, self);
    }

    public DisableUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableUserResponse setBody(DisableUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableUserResponseBody getBody() {
        return this.body;
    }

}
