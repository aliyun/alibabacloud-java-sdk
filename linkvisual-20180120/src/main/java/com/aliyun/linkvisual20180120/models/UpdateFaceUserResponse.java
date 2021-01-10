// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateFaceUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFaceUserResponseBody body;

    public static UpdateFaceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceUserResponse self = new UpdateFaceUserResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFaceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFaceUserResponse setBody(UpdateFaceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFaceUserResponseBody getBody() {
        return this.body;
    }

}
