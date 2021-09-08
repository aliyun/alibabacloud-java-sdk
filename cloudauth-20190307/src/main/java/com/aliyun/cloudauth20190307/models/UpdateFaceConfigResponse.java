// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateFaceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFaceConfigResponseBody body;

    public static UpdateFaceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceConfigResponse self = new UpdateFaceConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFaceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFaceConfigResponse setBody(UpdateFaceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFaceConfigResponseBody getBody() {
        return this.body;
    }

}
