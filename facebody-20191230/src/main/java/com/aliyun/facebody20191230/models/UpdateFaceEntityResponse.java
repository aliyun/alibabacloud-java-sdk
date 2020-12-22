// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class UpdateFaceEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFaceEntityResponseBody body;

    public static UpdateFaceEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceEntityResponse self = new UpdateFaceEntityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFaceEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFaceEntityResponse setBody(UpdateFaceEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFaceEntityResponseBody getBody() {
        return this.body;
    }

}
