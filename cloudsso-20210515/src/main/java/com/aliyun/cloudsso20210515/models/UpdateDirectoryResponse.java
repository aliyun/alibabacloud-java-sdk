// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDirectoryResponseBody body;

    public static UpdateDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDirectoryResponse self = new UpdateDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDirectoryResponse setBody(UpdateDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDirectoryResponseBody getBody() {
        return this.body;
    }

}
