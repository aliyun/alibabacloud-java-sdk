// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcubeWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMcubeWhitelistResponseBody body;

    public static DeleteMcubeWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeWhitelistResponse self = new DeleteMcubeWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcubeWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcubeWhitelistResponse setBody(DeleteMcubeWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcubeWhitelistResponseBody getBody() {
        return this.body;
    }

}
