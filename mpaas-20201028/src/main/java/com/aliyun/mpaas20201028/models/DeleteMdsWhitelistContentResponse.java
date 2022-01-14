// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMdsWhitelistContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMdsWhitelistContentResponseBody body;

    public static DeleteMdsWhitelistContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMdsWhitelistContentResponse self = new DeleteMdsWhitelistContentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMdsWhitelistContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMdsWhitelistContentResponse setBody(DeleteMdsWhitelistContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMdsWhitelistContentResponseBody getBody() {
        return this.body;
    }

}
