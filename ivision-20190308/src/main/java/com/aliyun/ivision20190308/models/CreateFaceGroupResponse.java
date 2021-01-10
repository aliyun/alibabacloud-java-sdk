// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class CreateFaceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFaceGroupResponseBody body;

    public static CreateFaceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFaceGroupResponse self = new CreateFaceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateFaceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFaceGroupResponse setBody(CreateFaceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFaceGroupResponseBody getBody() {
        return this.body;
    }

}
