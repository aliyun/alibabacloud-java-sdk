// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateStoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateStoryResponseBody body;

    public static UpdateStoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoryResponse self = new UpdateStoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStoryResponse setBody(UpdateStoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStoryResponseBody getBody() {
        return this.body;
    }

}
