// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class AttachHostsToBastionUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachHostsToBastionUserResponseBody body;

    public static AttachHostsToBastionUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachHostsToBastionUserResponse self = new AttachHostsToBastionUserResponse();
        return TeaModel.build(map, self);
    }

    public AttachHostsToBastionUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachHostsToBastionUserResponse setBody(AttachHostsToBastionUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachHostsToBastionUserResponseBody getBody() {
        return this.body;
    }

}
