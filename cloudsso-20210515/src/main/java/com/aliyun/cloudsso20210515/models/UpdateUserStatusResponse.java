// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUserStatusResponseBody body;

    public static UpdateUserStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserStatusResponse self = new UpdateUserStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserStatusResponse setBody(UpdateUserStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserStatusResponseBody getBody() {
        return this.body;
    }

}
