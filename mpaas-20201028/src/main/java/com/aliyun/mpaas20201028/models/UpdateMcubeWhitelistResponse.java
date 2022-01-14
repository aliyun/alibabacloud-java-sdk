// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateMcubeWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMcubeWhitelistResponseBody body;

    public static UpdateMcubeWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcubeWhitelistResponse self = new UpdateMcubeWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMcubeWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMcubeWhitelistResponse setBody(UpdateMcubeWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMcubeWhitelistResponseBody getBody() {
        return this.body;
    }

}
