// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class UpdateInstanceUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceUserResponseBody body;

    public static UpdateInstanceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceUserResponse self = new UpdateInstanceUserResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceUserResponse setBody(UpdateInstanceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceUserResponseBody getBody() {
        return this.body;
    }

}
