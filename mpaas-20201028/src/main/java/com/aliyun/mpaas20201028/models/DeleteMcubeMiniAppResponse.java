// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcubeMiniAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMcubeMiniAppResponseBody body;

    public static DeleteMcubeMiniAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeMiniAppResponse self = new DeleteMcubeMiniAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcubeMiniAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcubeMiniAppResponse setBody(DeleteMcubeMiniAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcubeMiniAppResponseBody getBody() {
        return this.body;
    }

}
