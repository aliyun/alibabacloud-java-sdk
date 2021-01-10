// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddFaceUserResponseBody body;

    public static AddFaceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserResponse self = new AddFaceUserResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceUserResponse setBody(AddFaceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceUserResponseBody getBody() {
        return this.body;
    }

}
