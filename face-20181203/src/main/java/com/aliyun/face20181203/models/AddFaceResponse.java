// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.face20181203.models;

import com.aliyun.tea.*;

public class AddFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddFaceResponseBody body;

    public static AddFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceResponse self = new AddFaceResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceResponse setBody(AddFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceResponseBody getBody() {
        return this.body;
    }

}
