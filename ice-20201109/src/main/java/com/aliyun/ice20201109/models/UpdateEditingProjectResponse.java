// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateEditingProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEditingProjectResponseBody body;

    public static UpdateEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEditingProjectResponse self = new UpdateEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEditingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEditingProjectResponse setBody(UpdateEditingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEditingProjectResponseBody getBody() {
        return this.body;
    }

}
