// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateFaceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFaceConfigResponseBody body;

    public static CreateFaceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFaceConfigResponse self = new CreateFaceConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateFaceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFaceConfigResponse setBody(CreateFaceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFaceConfigResponseBody getBody() {
        return this.body;
    }

}
