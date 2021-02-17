// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class UpdateFaceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFaceGroupResponseBody body;

    public static UpdateFaceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceGroupResponse self = new UpdateFaceGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFaceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFaceGroupResponse setBody(UpdateFaceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFaceGroupResponseBody getBody() {
        return this.body;
    }

}
