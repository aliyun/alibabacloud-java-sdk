// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateFileMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFileMetaResponseBody body;

    public static UpdateFileMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileMetaResponse self = new UpdateFileMetaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileMetaResponse setBody(UpdateFileMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileMetaResponseBody getBody() {
        return this.body;
    }

}
